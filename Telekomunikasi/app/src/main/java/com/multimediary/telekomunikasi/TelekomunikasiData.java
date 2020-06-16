package com.multimediary.telekomunikasi;

import java.util.ArrayList;

public class TelekomunikasiData {
    private static String[] namaAlat = {
            "Koran",
            "Telegraf",
            "Faksimile",
            "Telepon",
            "Radio",
            "Pager",
            "Televisi",
            "Walkie Talkie",
            "Komputer",
            "Telepon Genggam"
    };

    private static String[] tahunAlat = {
            "59 SM",
            "1837",
            "1843",
            "1871",
            "1896",
            "1925",
            "1937",
            "1946",
            "1949",
            "1973"
    };

    private static String[] penemuAlat = {
            "Julius Caesar",
            "Samuel Finley Breese Morse",
            "Alexander Bain",
            "Antonio Santi Giuseppe Meucci",
            "Guglielmo Marconi",
            "John Logie Baird",
            "Donald Lewes Hings",
            "Charles Babbage",
            "Alfred J Gross",
            "Martin Cooper"
    };
    private static String[] detailAlat = {
            "Koran atau surat kabar adalah suatu penerbitan yang ringan dan mudah dibuang, biasanya dicetak pada kertas berbiaya rendah yang disebut kertas koran, yang berisi berita-berita terkini dalam berbagai topik. Topiknya bisa berupa even politik, kriminalitas, olahraga, tajuk rencana, cuaca. Surat kabar juga biasa berisi karikatur yang biasanya dijadikan bahan sindiran lewat gambar berkenaan dengan masalah-masalah tertentu, komik, TTS dan hiburan lainnya. " +
                    "\n\nDari catatan para peneliti, koran pertama masih berupa lembaran berita yang ditulis tangan lalu dipasang di tempat umum. Acta Djurna dari masa Romawi kuno (59 SM), berisi berita sosial dan politik, diakui sebagai \"koran\" pertama dunia. Sedangkan koran cetak pertama adalah Di Bao (Ti-pao) tahun 700-an di Cina.  Metode pencetakannya menggunakan balok kayu yang dipahat aksara China. Bentuk koran berikutnya masih amat sederhana: newsletter dan " +
                    "buku berita, di tahun 1400-an. Beritanya lebih banyak berkaitan dengan dunia bisnis para bankir dan pedagang Eropa. Selanjutnya, newsletter dan buku berita berkembang menjadi lembar berita/newsheet tahun 1500-an.",
            "Telegraf merupakan sebuah mesin/alat yang menggunakan teknologi telegrafi untuk mengirim dan menerima pesan dari jarak jauh, biasanya menggunakan morse sebagai kode komunikasi. Kata telegraf yang sering didengar saat ini, secara umum merupakan telegraf elektrik. Telegraf diciptakan oleh seorang warga Amerika Serikat bernama Samuel F.B. Morse bersama dengan asistennya Alexander Bain. " +
                    "\n\nTelegraf Amerika pertama dikirimkan oleh Morse pada tanggal 6 Januari 1838 melalui 2 mil / 3 km kawat di Speedwell Ironworks dekat Morristown, New Jersey. Pesannya dibaca \"Seorang penunggu yang sabar bukanlah pecundang\" (A patient waiter is no loser) dan pada tanggal 24 Mei 1844, ia mengirim sebuah pesan “Apa yang telah Tuhan ciptakan\" (What hath God wrought).",
            "Faksimile atau biasa dikenal dengan faks/fax, berasal dari kata 'fac simile' (make similar) dalam bahasa latin, yang artinya membuat salinan yang sama dengan aslinya. Dalam bidang yang lain, mesin faks juga dapat disebut telecopier. Mesin faks adalah peralatan komunikasi yang digunakan untuk mengirimkan dokumen dengan menggunakan suatu perangkat yang mampu beroperasi melalui jaringan telepon dengan hasil yang serupa dengan aslinya. " +
                    "\n\nMesin Fax pertama kali ditemukan dan dipatenkan pada tahun 1843 oleh seorang fisikawan asal Skotlandia yang berana Alexander Bain. Pada awalnya Alexander sedang mengembangkan alat komunikasi yang bernama telegraf. Dari sinilah cikal bakal penemuan mesin fax ditemukan. Mesin fax yang dibuat oleh Alexander ini berdasarkan suatu prinsip kerja jam elektrik yang sebelumnya sudah ia temukan.",
            "Telepon adalah pesawat dengan listrik dan kawat, untuk bercakap-cakap antara dua orang yang berjauhan tempatnya. Kebanyakan telepon beroperasi dengan menggunakan transmisi sinyal listrik dalam jaringan telepon sehingga memungkinkan pengguna telepon untuk berkomunikasi dengan pengguna lainnya. Pada 1871, Antonio Meucci mematenkan penemuannya yang disebut sound Telegraph. Penemuannya ini memungkinkan adanya komunikasi dalam bentuk suara antara dua orang dengan menggunakan perantara kabel." +
                    "\n\nSoal penemuan telepon, banyak kontroversi dan gugat-menggugat antar penemu yang mengklaim satu sama lain. Secara garis besar, penemuan ini melibatkan nama Alexander Graham Bell, Antonio Meucci, hingga Elisha Gray. Banyak orang belum tahu dan menganggap kalau Bell sebagai penemu pertama telepon. Kongres AS pada Juni 2002 telah menetapkan Antonio Meucci sebagai penemu teknologi telepon pertama, bukan Bell." +
                    "\n\nMeucci yang berasal dari Italia ini pada 1871 hanya mematenkan temuannya secara sementara, karena keterbatasan ekonomi. Pada saat Bell dinobatkan sebagai penemu telepon, ia sempat menggugat USPTO. Namun, dalam persidangan Meucci mengalami kekalahan. Walau dinobatkan lebih dari satu abad kemudian, perjuangannya dulu tidak pernah sia-sia.",
            "Radio adalah teknologi yang digunakan untuk pengiriman sinyal dengan cara modulasi dan radiasi elektromagnetik (gelombang elektromagnetik). Gelombang ini melintas, dan merambat lewat udara, dan bisa juga merambat lewat ruang angkasa yang hampa udara, karena gelombang ini tidak memerlukan medium pengangkut (seperti molekul udara). " +
                    "\n\nCikal bakal perkembangan radio ialah ditemukannya gramofon atau phonograph karya Thomas Alfa Edison yang berhasil menemukan phonograph di tahun 1877. Setelah itu dua ilmuan cerdas, Helmholtz Hertz dan James Clerk Maxwell, melakukan riset mengenai fenomena elektromagnetik dan berhasil menemukan gelombang radio." +
                    "\n\nPada tahun 1896 ilmuwan Italia, Guglielmo Marconi mendapat hak paten atas telegraf nirkabel yang menggunakan dua sirkuit. Pada saat itu sinyal ini hanya bisa dikirim pada jarak dekat. Namun, hal inilah yang memulai perkembangan teknologi radio. Pada tahun 1897, Marconi kembali mempublikasikan penemuan bahwa sinyal nirkabel dapat ditransmisikan pada jarak yang lebih jauh (12 mil (19000 m)).",
            "Penyeranta lebih dikenal dengan sebutan pager yaitu alat telekomunikasi pribadi untuk menyampaikan dan menerima pesan pendek. Penyeranta numerik satu arah hanya dapat menerima pesan yang terdiri dari beberapa digit saja, khas layaknya sebuah nomor telepon yang digunakan penggunanya untuk menelepon. Penyeranta alphanumerik juga tersedia dengan sistem dua arah dapat mengirim pesan melalui surat elektronik atau SMS (short message service)." +
                    "\n\nSistem pager telah ada sejak tahun 1921. Pager pertama kali digunakan oleh departemen kepolisian Detroit, Amerika Serikat. Tapi baru pada tahun 1949 sistem tersebut dipatenkan oleh Alfred J Gross.",
            "Televisi (TV) adalah sebuah media telekomunikasi terkenal yang berfungsi sebagai penerima siaran gambar bergerak beserta suara, baik itu yang monokrom (hitam-putih) maupun berwarna. Kata televisi merupakan gabungan dari kata tele (τῆλε, 'jauh') dari bahasa Yunani dan visio ('penglihatan') dari bahasa Latin, sehingga televisi dapat diartikan sebagai alat komunikasi jarak jauh yang menggunakan media visual/penglihatan. " +
                    "\n\nPada tahun 1925, sejarah perkembangan televisi menapaki babak baru ketika John Logie Baird yang berkebangsaan Skotlandia memperlihatkan televisi kepada umum untuk pertama kalinya, Sehingga penemu pertama kali televisi yakni John Logie Baird.",
            "Walkie talkie adalah sebuah alat komunikasi genggam yang dapat mengkomunikasikan dua orang atau lebih dengan menggunakan gelombang radio. Kebanyakan walkie talkie digunakan untuk melakukan kedua fungsinya yaitu berbicara ataupun mendengar. Walkie Talkie dikenal dengan sebutan Two Way Radio ataupun radio dua arah, yang dapat melakukan pembicaraan dua arah, berbicara dan mendengar lawan bicara secara bergantian. Walkie talkie dapat digunakan dalam jarak 0,5 Km sampai dengan 2,5 Km tanpa menggunakan biaya pulsa seperti menelpon. " +
                    "\n\nWalkie Talkie dibuat pada tahun 1937 oleh seorang penemu asal Kanada yang bernama, Donald Lewes Hings , P.Eng, M.B.E., C.M. Pada saat pertamakali ditemukan, walkie talkie belum dinamakan walkie talkie, benda tersebut adalah waterproof 2ways radio dan diproduksi untuk Dominico pada tahun 1938.",
            "Komputer adalah alat yang dipakai untuk mengolah data menurut perintah yang telah diprogram. Kata komputer semula dipergunakan untuk menggambarkan orang yang perkerjaannya melakukan perhitungan aritmetika, dengan atau tanpa alat bantu, tetapi arti kata ini kemudian dipindahkan kepada mesin itu sendiri. Asal mulanya, pengolahan informasi hampir eksklusif berhubungan dengan masalah aritmatika, tetapi komputer modern dipakai untuk banyak tugas yang tidak berhubungan dengan matematika. " +
                    "\n\nCharles Babbage merupakan salah seorang ilmuwan di dunia yang tercatat sebagai penemu Komputer Pertama, yang telah banyak memberikan karyanya pada kehidupan manusia, khususnya bidang komputer. Mesin penghitung (Difference Engine no.1) yang ditemukan oleh Charles Babbage (1791-1871) adalah salah satu icon yang paling terkenal dalam sejarah perkembangan komputer dan merupakan kalkulator otomatis pertama." +
                    "\n\nSejarah komputer generasi pertama yaitu digital elektronik atau bisa di sebut dengan ENIAC (Electronic Numerical Integrator and Calculator). Program pada ENIAC, sudah di rancang pada tahun 1942 dan selesai pada tahun 1946.",
            "Telepon genggam atau telepon seluler (disingkat ponsel) atau handphone (disingkat HP) adalah perangkat telekomunikasi elektronik yang mempunyai kemampuan dasar yang sama dengan telepon konvensional saluran tetap, tetapi dapat dibawa ke mana-mana (bahasa Inggris: portable atau mobile) dan tidak perlu disambungkan dengan jaringan telepon menggunakan kabel (jadi komunikasi nirkabel, bahasa Inggris: wireless communication). Saat ini, Indonesia mempunyai dua jaringan telepon nirkabel yaitu sistem GSM dan sistem CDMA." +
                    "\n\nPenemu telepon genggam yang pertama adalah Martin Cooper, seorang karyawan Motorola pada tanggal 03 April 1973, walaupun banyak disebut-sebut penemu telepon genggam adalah sebuah tim dari salah satu divisi Motorola (divisi tempat Cooper bekerja) dengan model pertama adalah DynaTAC. Ide yang dicetuskan oleh Cooper adalah sebuah alat komunikasi yang kecil dan mudah dibawa bepergian secara fleksibel."
    };

    private static int[] gambarAlat = {
            R.drawable.koran,
            R.drawable.telegraph,
            R.drawable.fax,
            R.drawable.telephone,
            R.drawable.radio,
            R.drawable.pager,
            R.drawable.tv,
            R.drawable.walkie_talkie,
            R.drawable.computer,
            R.drawable.handphone
    };

    static ArrayList<Telekomunikasi> getListData() {
        ArrayList<Telekomunikasi> list = new ArrayList<>();
        for (int position = 0; position < namaAlat.length; position++) {
            Telekomunikasi telekomunikasi = new Telekomunikasi();
            telekomunikasi.setName(namaAlat[position]);
            telekomunikasi.setDetail(detailAlat[position]);
            telekomunikasi.setYear(tahunAlat[position]);
            telekomunikasi.setFounder(penemuAlat[position]);
            telekomunikasi.setPhoto(gambarAlat[position]);
            list.add(telekomunikasi);
        }
        return list;
    }
}
