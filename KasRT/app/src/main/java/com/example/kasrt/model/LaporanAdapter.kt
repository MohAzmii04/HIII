package com.example.kasrt.model
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kasrt.R
import com.example.kasrt.model.DataItem
class LaporanAdapter(private val data: MutableList<DataItem>) :
    RecyclerView.Adapter<LaporanAdapter.ListViewHolder>() {
    constructor() : this(mutableListOf())
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_laporan, parent, false)
        return ListViewHolder(view)
    }
    fun setData(dataItems: List<DataItem>) {
        data.clear()
        data.addAll(dataItems)
        notifyDataSetChanged()
    }
    override fun getItemCount(): Int = data.size
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val item = data[position]
        holder.tvIuranPerwarga.text = "1. Iuran Perwarga : "+ item.jumlah_iuran_bulanan.toString()
        holder.tvJumlahIuranBulanan.text = "2. Jumlah Iuran Bulanan : "+
                item.jumlah_iuran_bulanan.toString()
        holder.tvTotalIuranRekap.text = "3. Total Iuran Rekap (Setahun) : "+
                item.total_rekap_iuran_bulanan.toString()
        holder.tvPengeluaran.text = "4. Pengeluaran Iuran : "+ item.pengeluaran_iuran.toString()
        holder.tvPemanfaatan.text = "5. Pemanfaatan Iuran : "+ item.pemanfaatan_iuran
        holder.tvUnitRumah.text = "6. Unit Rumah : "+ item.unit_rumah
        holder.tvUnitRumahKasDone.text = "7. Unit Rumah : "+ item.unitrumah_sudah_membayar_kas
    }
    class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var tvIuranPerwarga: TextView = itemView.findViewById(R.id.jumlahIuranBulananTextView)
        var tvJumlahIuranBulanan: TextView = itemView.findViewById(R.id.jumlahIuranBulananTextView)
        var tvPengeluaran: TextView = itemView.findViewById(R.id.pengeluaranTextView)
        var tvPemanfaatan: TextView = itemView.findViewById(R.id.pemanfaatanTextView)
        var tvTotalIuranRekap: TextView = itemView.findViewById(R.id.totalIuranRekapTextView)
        var tvUnitRumah: TextView = itemView.findViewById(R.id.UnitRumahTextView)
        var tvUnitRumahKasDone: TextView = itemView.findViewById(R.id.UnitRumahKasDoneTextView)
    }
}