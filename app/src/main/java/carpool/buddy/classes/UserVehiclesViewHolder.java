package carpool.buddy.classes;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import carpool.buddy.R;

public class UserVehiclesViewHolder extends RecyclerView.ViewHolder {
    TextView isEV, vehicleModel;
    ImageButton deleteVehicle;
    public UserVehiclesViewHolder(@NonNull View itemView) {
        super(itemView);
        deleteVehicle = itemView.findViewById(R.id.deleteVehicle);
        isEV = itemView.findViewById(R.id.isEV);
        vehicleModel = itemView.findViewById(R.id.vehicleModel);
    }
}
