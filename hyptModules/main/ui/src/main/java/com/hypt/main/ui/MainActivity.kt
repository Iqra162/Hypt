package com.hypt.main.ui

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.navigation.NavigationFlow
import com.navigation.Navigator
import com.navigation.ToFlowNavigatable


class MainActivity : AppCompatActivity(), ToFlowNavigatable, NavigationView.OnNavigationItemSelectedListener {
    private val navigator: Navigator = Navigator()
    lateinit var drawer_layout : DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        var toolbar: Toolbar = findViewById(R.id.toolbar)

        toolbar.title = ""
        setSupportActionBar(toolbar)
        var drawerToggle = ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolbar,
            R.string.open_drawer,
            R.string.close_drawer
        )
        drawer_layout.addDrawerListener(drawerToggle)
          drawerToggle.syncState()
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // toolbar.setNavigationIcon(R.drawable.ic_team);

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navigator.navController = navHostFragment.navController
        navView.setupWithNavController(navigator.navController)


    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.custom_toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.nav_search) {
            Toast.makeText(this, "Click Search Icon.", Toast.LENGTH_SHORT).show()
        } else if (item.itemId == R.id.nav_menu) {
            Toast.makeText(this, "Clicked menue Icon..", Toast.LENGTH_SHORT).show()

            if (drawer_layout.isDrawerOpen(GravityCompat.END)) {
                drawer_layout.closeDrawer(GravityCompat.END)
            } else {
                drawer_layout.openDrawer(GravityCompat.END)
            }

        }
        return super.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle item click here
        when (item.itemId) {
            R.id.nav_item1 -> {
                // Handle item 1 click
            }

            R.id.nav_item2 -> {
                // Handle item 2 click
            }
            // Add more cases as needed
        }

        drawer_layout.closeDrawers()
        return true
    }

    //    private void showPopupMenu(View view) {
//        PopupMenu popupMenu = new PopupMenu(this, view);
//        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
//
//        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem menuItem) {
//                // Handle menu item click
//                switch (menuItem.getItemId()) {
//                    case R.id.menu_item1:
//                    // Do something
//                    return true;
//                    case R.id.menu_item2:
//                    // Do something else
//                    return true;
//                    default:
//                    return false;
//                }
//            }
//        });
//
//        popupMenu.show();
//    }
    override fun navigateToFlow(flow: NavigationFlow) {
        navigator.navigateToFlow(flow)
    }
}