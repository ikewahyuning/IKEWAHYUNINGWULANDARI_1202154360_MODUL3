package com.example.android.ikewahyuningwulandari_1202154360_modul3;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterAir extends RecyclerView.Adapter<AdapterAir.ViewHolder> {


    private ArrayList<String> arrayListTitle, arrayListDesc;
    private ArrayList<Integer> arrayListGambar;


    AdapterAir(ArrayList<String> arrayListTitle, ArrayList<String> arrayListDesc, ArrayList<Integer> arrayListGambar){
        this.arrayListTitle = arrayListTitle;
        this.arrayListDesc = arrayListDesc;
        this.arrayListGambar = arrayListGambar;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nama, ket;
        private ImageView Gambar;
        private LinearLayout List;

        public ViewHolder(View itemView) {
            super(itemView);

            nama = itemView.findViewById(R.id.title);
            ket = itemView.findViewById(R.id.desc);
            Gambar = itemView.findViewById(R.id.gambar);
            List = itemView.findViewById(R.id.list_item);
        }
    }

    @Override
    public AdapterAir.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View tam = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_list, parent,false);
        ViewHolder lan = new ViewHolder(tam);
        return lan;
    }

    @Override
    public void onBindViewHolder(AdapterAir.ViewHolder holder, final int position) {

        final String title = arrayListTitle.get(position);
        final String desc = arrayListDesc.get(position);
        final Integer gambar = arrayListGambar.get(position);
        holder.nama.setText(title);
        holder.ket.setText(desc);
        holder.Gambar.setImageResource(gambar);

        holder.List.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                String descs = "ades adalah merek air mineral atau air minum dalam kemasan (AMDK) yang diproduksi oleh PT. Coca-Cola Bottling Indonesia, Bekasi. Air mineral tersebut juga dikenal sebagai I-Lohas di Jepang. Kini The Coca-Cola Company merupakan pemilik merek dagang Ades, menggantikan PT. Akasha Wira Internasional atau PT. AdeS Waters Indonesia, pemilik merek dagang Ades sebelumnya.";
                String descs1 ="AMIDIS adalah produk Air Minum Dalam Kemasan (AMDK) yang sudah diproduksi sejak tahun 1997 dan merupakan air minum distilasi pertama di Indonesia yang telah menjadi salah satu produk AMDK yang dipercaya karena kualitas mutu dan kemurniannya. AMIDIS sangat memperhatikan kualitas dari produk,";
                String descs2 ="Aqua adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia, Singapura, dan Brunei. Aqua adalah merek AMDK dengan penjualan terbesar di Indonesia dan merupakan salah satu merek AMDK yang paling terkenal di Indonesia, sehingga telah menjadi seperti merek generik untuk AMDK.";
                String descs3 ="Cleo water adalah air mineral yang memiliki banyak manfaat dan keuntungan bagi orang-orang yang memilih untuk meminumnya, cleo water juga terbuat dari air murni.";
                String descs4 ="Club adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. Club diproduksi oleh PT Tirta Sukses Perkasa (dahulu PT Tirta Bahagia) sejak tahun 1986. Pada bulan November 2013, merek Club diakuisisi oleh PT Indofood CBP Sukses Makmur Tbk.";
                String descs5 ="EQUIL pertama kali dibotolkan pada tahun 1998 di sumbernya, Villa D'Equilibrium, dan diluncurkan ke pasar yang saat itu sebagian besar dimonopoli oleh beberapa merek Eropa. Meski minum air mineral alami tertanam dalam budaya santapan Eropa, gourmet dan eksklusivitas konsep ini telah diterima oleh masyarakat lokal setempat.";
                String descs6 ="Evian (pengucapan bahasa Perancis: [evjɑ̃ ]) adalah sebuah merek air mineral Perancis yang berasal dari berbagai sumber dekat Évian-les-Bains, di pesisir selatan Lac Léman.\n" +
                        "\n" +
                        "Saat ini Evian dimiliki oleh Groupe Danone, sebuah perusahaan multinasional Perancis. Selain air mineral, Groupe Danone memakai nama Evian untuk jajaran produk perawatan kulit organik serta sebuah resor mewah di Perancis.";
                String descs7 ="Kini air minum dalam kemasan (AMDK) sudah menjadi barang familiar. Hampir setiap hari bisa Anda temui dan didapatkan oleh orang-orang di perkotaan seperti Jakarta. Untuk mendapatkan AMDK pun mudah, Anda hanya cukup mendatangi minimarket atau warung kelontong terdekat. Pada umumnya, AMDK juga dijual dengan harga yang terjangkau, yakni cukup selembar Rp5 ribu Anda sudah mendapatkan AMDK dan pasti bisa mendapat kembalian.";
                String descs8 ="Produk ini bisa kita temukan dengan mudah di berbagai jaringan ritel modern hingga tradisional sekalipun. Saya adalah salah satu konsumen Loyal (Karena saya konsumsi hampir setiap hari, saya merekomendasikan ke orang lain dan melakukan pembelian berulang) dari produk ini. Setiap pagi sebelum berangkat ke kantor, saya akan mampir ke Indomaret terdekat untuk beli 4 - 6 botol Nestle PureLIfe Ukuran 600 ml.";
                String descs9 ="Pristine dengan kandungan Alkaline Water yang berisi air basa yang ber Ph 8+, dapat berfungsi untuk mengecilkan pori-pori sehingga kulit wajah akan menjadi lebih kencang. Jika kamu bermasalah dengan flek hitam, tidak perlu khawatir. Air Alkali juga bisa membantu untuk menghilangkannya. Sehingga wajah terlihat segar, tidak kusam, serta dapat juga digunakan untuk menghilangkan jerawat-jerawat dan bekas luka.";
                String descs10 = "VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta. Pada tanggal 17 Juli 1987 kepemilikan PT Varia Industri Tirta beralih kepada Tirto Utomo. Sebelas tahun kemudian, setelah melakukan merger dengan PT Varia Industri Tirta, PT Tirta Investama menjadi pemilik merek VIT.";

                switch (position){
                    case 0:
                        intent.putExtra("nama", arrayListTitle.get(position));
                        intent.putExtra("ket", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("nama", arrayListTitle.get(position));
                        intent.putExtra("ket", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs1);
                        v.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("nama", arrayListTitle.get(position));
                        intent.putExtra("ket", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs2);
                        v.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("nama", arrayListTitle.get(position));
                        intent.putExtra("ket", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs3);
                        v.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("nama", arrayListTitle.get(position));
                        intent.putExtra("ket", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs4);
                        v.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("nama", arrayListTitle.get(position));
                        intent.putExtra("ket", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs5);
                        v.getContext().startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("nama", arrayListTitle.get(position));
                        intent.putExtra("ket", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs6);
                        v.getContext().startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("nama", arrayListTitle.get(position));
                        intent.putExtra("ket", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs7);
                        v.getContext().startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("nama", arrayListTitle.get(position));
                        intent.putExtra("ket", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs8);
                        v.getContext().startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("nama", arrayListTitle.get(position));
                        intent.putExtra("ket", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs9);
                        v.getContext().startActivity(intent);
                        break;
                    case 10:
                        intent.putExtra("nama", arrayListTitle.get(position));
                        intent.putExtra("ket", arrayListDesc.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs10);
                        v.getContext().startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListTitle.size();
    }
}