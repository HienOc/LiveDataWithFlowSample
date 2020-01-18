/*
 * Copyright (C) 2020 Fatih Giris. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.fatih.livedatawithflowsample.ui.weatherforecast.datastreamflow

import androidx.lifecycle.ViewModel
import io.fatih.livedatawithflowsample.data.weatherforecast.WeatherForecastRepository
import io.fatih.livedatawithflowsample.shared.Result
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class WeatherForecastDataStreamFlowViewModel @Inject constructor(
    weatherForecastRepository: WeatherForecastRepository
) : ViewModel() {

    private val _weatherForecast = weatherForecastRepository
        .fetchWeatherForecastRealTime()

    val weatherForecast: Flow<Result<Int>>
        get() = _weatherForecast
}
