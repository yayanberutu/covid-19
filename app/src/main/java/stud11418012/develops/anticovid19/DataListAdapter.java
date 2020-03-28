package stud11418012.develops.anticovid19;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataListAdapter extends RecyclerView.Adapter<DataListAdapter.DataViewHolder> {

    private final LayoutInflater mInflater;
    private List<Data> mDatas;

    public DataListAdapter(Context context) { mInflater = LayoutInflater.from(context); }

    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.recyclerview_item, parent, false);
        return new DataViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {
        if (mDatas != null) {
            Data current = mDatas.get(position);
            holder.dataItemView.setText(current.getData);
        } else {
            // Covers the case of data not being ready yet.
            holder.dataItemView.setText("No Word");
        }
    }

    public void setDatas(List<Data> datas){
        mDatas = datas;
        notifyDataSetChanged();
    }

    // getItemCount() is called many times, and when it is first called,
    // mWords has not been updated (means initially, it's null, and we can't return null).
    @Override
    public int getItemCount() {
        if (mDatas != null)
            return mDatas.size();
        else return 0;
    }

    class DataViewHolder extends RecyclerView.ViewHolder {
        private final TextView dataItemView;

        private DataViewHolder(View itemView) {
            super(itemView);
            dataItemView = itemView.findViewById(R.id.textView);
        }
    }
}
