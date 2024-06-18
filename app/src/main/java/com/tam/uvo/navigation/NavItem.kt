package com.tam.uvo.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.NoteAlt
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.RecordVoiceOver
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItem(
    val label: String,
    val icon: ImageVector,
    val route: String
)

val list = listOf(
    NavItem(
        label = "Home",
        icon = Icons.Outlined.Home,
        route = Screens.HomeScreen.name
    ),
    NavItem(
        label = "Space",
        icon = Icons.Outlined.RecordVoiceOver,
        route = Screens.SpaceScreen.name
    ),
    NavItem(
        label = "Report",
        icon = Icons.Outlined.NoteAlt,
        route = Screens.ReportScreen.name
    ),
    NavItem(
        label = "Notification",
        icon = Icons.Outlined.Notifications,
        route = Screens.NotificationScreen.name
    ),
    NavItem(
        label = "Profile",
        icon = Icons.Outlined.Person,
        route = Screens.ProfileScreen.name
    ),

)