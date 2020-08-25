/*
 * This file is part of the UNES Open Source Project.
 * UNES is licensed under the GNU GPLv3.
 *
 * Copyright (c) 2020. João Paulo Sena <joaopaulo761@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.forcetower.uefs.core.injection.module

import com.forcetower.uefs.feature.settings.AccountSettingsFragment
import com.forcetower.uefs.feature.settings.AdvancedSettingsFragment
import com.forcetower.uefs.feature.settings.RootSettingsFragment
import com.forcetower.uefs.feature.settings.SyncSettingsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class SettingsModule {
    @ContributesAndroidInjector
    abstract fun accountSettingsFragment(): AccountSettingsFragment
    @ContributesAndroidInjector
    abstract fun rootSettingsFragment(): RootSettingsFragment
    @ContributesAndroidInjector
    abstract fun syncSettingsFragment(): SyncSettingsFragment
    @ContributesAndroidInjector
    abstract fun advancedSettingsFragment(): AdvancedSettingsFragment
}
