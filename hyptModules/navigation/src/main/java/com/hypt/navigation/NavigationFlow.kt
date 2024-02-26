package com.navigation

sealed class NavigationFlow {
    object HomeFlow : NavigationFlow()
    object ProfileFlow : NavigationFlow()
    object BaseFlow :NavigationFlow()
    object TeamsFlow : NavigationFlow()
}
