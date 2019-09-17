package com.example.androidjetpack.architecture.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import com.example.androidjetpack.R
import kotlinx.android.synthetic.main.activity_navigation_test.*


class NavigationTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_test)

        // Cài đặt bằng code (Không dùng Fragment)
        val host = NavHostFragment.create(R.navigation.nav_game)
        supportFragmentManager.beginTransaction().replace(R.id.layoutFragmentContainer, host).setPrimaryNavigationFragment(host).commit()
    }

    /*override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.navigation_test, menu)
        return true
    }*/

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        /*return when (item.getItemId()) {
            R.id.action_home -> {
                //...
                true
            }
            R.id.action_leaderBoard -> {
                //...
                true
            }
            else -> super.onOptionsItemSelected(item)
        }*/
        return true
    }
}
