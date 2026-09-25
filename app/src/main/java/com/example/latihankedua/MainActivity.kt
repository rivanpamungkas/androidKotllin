package com.example.latihankedua

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.latihankedua.ui.theme.LatihanKeduaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val namaToko: String = "Warung BU Yanti"
        var hargaProduk: Double = 15000.0
        var stokBarang: Int = 25
        val tokoBuku: Boolean = true

        Log.d("KatalogUMKM", "Nama Toko: $namaToko")
        Log.d("KatalogUmkm", "Harga Produk: $hargaProduk")
        Log.d("KatalogUmkm", "Stok Barang: $stokBarang")
        Log.d("KatalohUmkm", "Status Buka: $tokoBuku")

        Toast.makeText(this, "Selamat datang di $namaToko", Toast.LENGTH_LONG).show()

        val kategoriProduk: String = "Makanan Ringan"
        Log.d("KatalogUmkm", "Kategori Produk: $kategoriProduk")

        stokBarang = 18
        Log.d("KatalogUmkm", "Stok Barang Terbaru: $stokBarang")

        val kotaAsal = "Batusangkar"

        kotaAsal = 12345
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LatihanKeduaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LatihanKeduaTheme {
        Greeting("Android")
    }
}