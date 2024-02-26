package com.navigation

import androidx.navigation.NavController
import com.hypt.navigation.MainNavGraphDirections

class Navigator {
    lateinit var navController: NavController

    // navigate on main thread or nav component crashes sometimes
    fun navigateToFlow(navigationFlow: NavigationFlow) = when (navigationFlow) {
        NavigationFlow.HomeFlow -> navController.navigate(MainNavGraphDirections.actionGlobalHomeFlow())
        NavigationFlow.BaseFlow -> navController.navigate(MainNavGraphDirections.actionGlobalBaseFlow())
        NavigationFlow.ProfileFlow -> navController.navigate(MainNavGraphDirections.actionGlobalProfileFlow())
        NavigationFlow.TeamsFlow -> navController.navigate(MainNavGraphDirections.actionGlobalTeamsFlow())


    }

}
