package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var fruitsAdapter:FruitsAdapter
    private lateinit var fruitsData:ArrayList<FruitsData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**set init*/
        fruitsData = ArrayList<FruitsData>()
        fruitsAdapter = FruitsAdapter(this,fruitsData)
        val fruitsRecycler = findViewById<RecyclerView>(R.id.fruitsRecycler)
        fruitsRecycler.layoutManager = LinearLayoutManager(this)
        fruitsRecycler.adapter = fruitsAdapter
        /**set list*/
        listFruits()
    }
    /**ok now we set dummy data*/
    fun listFruits(){
        fruitsData.add(FruitsData(R.drawable.watermelon,"1. Semangka:","Semangka adalah tanaman merambat yang berasal dari daerah setengah gurun di Afrika bagian selatan. Tanaman ini masih sekerabat dengan labu-labuan, melon dan ketimun. Semangka biasa dipanen buahnya untuk dimakan segar atau dibuat jus. Biji semangka yang dikeringkan dan disangrai juga dapat dimakan isinya sebagai kuaci.","4.7"))
        fruitsData.add(FruitsData(R.drawable.strawberry,"2. Stroberi:","Stroberi merupakan tanaman buah berupa herba yang ditemukan pertama kali di Chili, Amerika. Salah satu spesies tanaman strawberry yaitu Fragaria chiloensis L. menyebar ke berbagai negara antara lain Amerika, Eropa dan Asia. Stroberi merupakan tanaman buah pada daerah sub tropik.","4.6"))
        fruitsData.add(FruitsData(R.drawable.cantaloupe,"3. Melon:","Melon merupakan nama buah sekaligus tanaman yang menghasilkannya yang termasuk dalam suku labu-labuan atau Cucurbitaceae. Buahnya biasanya dimakan segar sebagai buah meja atau diiris-iris sebagai campuran es buah. Bagian yang dimakan adalah daging buah.","4.7"))
        fruitsData.add(FruitsData(R.drawable.peach,"4. Persik: ","Persik adalah tanaman tanaman berbuah dari famili Rosaceae. Buah ini disebut juga sebagai buah táo dalam bahasa Mandarin dan momo dalam bahasa Jepang. Buah persik, kadang disebut nektarina, memiliki daging berwarna kuning dengan aroma harum dan memiliki satu biji yang keras.","4.4"))
        fruitsData.add(FruitsData(R.drawable.blackberry,"5. Blackberry:","Blackberry merupakan buah yang dapat dimakan diproduksi oleh beberapa spesies dalam genus Rubus dari suku Rosaceae. Buah ini sebenarnya bukanlah merupakan berry, secara botani itu disebut buah agregat, terdiri dari drupelet kecil. Tanaman biasanya berumur dwitahunan dan akar tongkat abadi.","4.3"))
        fruitsData.add(FruitsData(R.drawable.pineapple,"6. Nanas: ","Nanas merupakan salah satu tanaman komoditi yang banyak ditanam di Indonesia. Nanas atau Ananas comosus merupakan keluarga Bromeliaceae dengan ciri-ciri berduri di bagian kulit luar dan di atas buah terdapat daun-daun pendek yang tersusun.","4.8"))
        fruitsData.add(FruitsData(R.drawable.plum,"7. Prem: ","Prem bisa merujuk pada pohon dan buah yang memiliki nama yang sama. Prem merupakan bagian dari genus Prunus, subgenus Prunus.","4.1"))
        fruitsData.add(FruitsData(R.drawable.orange,"8. Jeruk: ","Jeruk atau limau adalah semua tumbuhan berbunga anggota marga Citrus dari suku Rutaceae (suku jeruk-jerukan). Anggotanya berbentuk pohondengan buah yang berdaging dengan rasa masam yang segar, meskipun banyak di antara anggotanya yang memiliki rasa manis.","4.9"))
        fruitsData.add(FruitsData(R.drawable.raspberry,"9. Rasberi:","Rasberi adalah jenis buah yang dapat dimakan, yang berasal dari berbagai jenis tumbuhan dalam famili mawar bergenus Rubus, di mana sebagian besar spesies termasuk dalam subgenus Idaeobatus, nama yang juga berlaku untuk tanaman ini","4.1"))
        fruitsData.add(FruitsData(R.drawable.apples,"10. Apel:","Apel merupakan jenis buah-buahan, atau buah yang dihasilkan dari pohon apel. Buah apel biasanya berwarna merah kulitnya jika masak dan, namun bisa juga kulitnya berwarna hijau atau kuning. Kulit buahnya agak lembek dan daging buahnya keras. Buah apel memiliki beberapa biji di dalamnya.","4.8"))
        fruitsData.add(FruitsData(R.drawable.blueberry,"11. Bluberi:","Bluberi atau beri biru adalah tanaman berbunga dalam genus Vaccinium, bagian Cyanococcus. Spesies ini tumbuh di Amerika Utara.","4.6"))
    }

}