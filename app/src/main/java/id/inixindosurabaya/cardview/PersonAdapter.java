package id.inixindosurabaya.cardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

    private ArrayList<Persons> dataList;

    public PersonAdapter(ArrayList<Persons> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.activity_row_person, parent, false);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        holder.txt_name.setText(dataList.get(position).getName());
        holder.txt_email.setText(dataList.get(position).getEmail());
        holder.txt_phone.setText(dataList.get(position).getPhone());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    // membuat class untuk ViewHolder
    public class PersonViewHolder extends RecyclerView.ViewHolder {
        // inisialisasi komponen
        private TextView txt_name, txt_email, txt_phone;

        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            // mengenali komponen
            txt_name = itemView.findViewById(R.id.txt_name_person);
            txt_email = itemView.findViewById(R.id.txt_email_person);
            txt_phone = itemView.findViewById(R.id.txt_phone_person);
        }
    }
}
