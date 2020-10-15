package com.bagus.navigation_bla;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.bagus.navigation_bla.dataModel.FormulirMahasiswa;
import com.bagus.navigation_bla.databinding.FragmentGameBinding;

import java.util.Objects;


public class GameFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_detail, container, false);
        FragmentGameBinding binding = FragmentGameBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.textView1.setText(getArguments().getString("namaMahasiswa"));
        binding.textView2.setText(getArguments().getString("jenisKelamin"));
        binding.textView3.setText(getArguments().getString("statusKawin"));
        binding.textView4.setText(getArguments().getString("agama"));
        binding.textView5.setText(getArguments().getString("kewarganegaraan"));
        binding.textView6.setText(getArguments().getString("alamatSurat"));
        binding.textView7.setText(getArguments().getString("alamatAsal"));
        binding.textView8.setText(getArguments().getString("kota"));
        binding.textView9.setText(getArguments().getString("provinsi"));
        binding.textView10.setText(getArguments().getString("noRumah"));
        binding.textView11.setText(getArguments().getString("noHp"));
        binding.textView12.setText(getArguments().getString("email"));
        binding.textView13.setText(getArguments().getString("namaOrtu"));
        binding.textView14.setText(getArguments().getString("asalPerguruan"));
        binding.textView15.setText(getArguments().getString("prodi"));
        binding.textView16.setText(getArguments().getString("akreditasi"));

        //Point B
        binding.textView17.setText(getArguments().getString("pilihanA"));
        binding.textView18.setText(getArguments().getString("pilihanB"));

        //Point C
        binding.textView19.setText(getArguments().getString("asalSekolah"));
        binding.textView20.setText(getArguments().getString("alamatSekolah"));
        binding.textView21.setText(getArguments().getString("kotaSekolah"));
        binding.textView22.setText(getArguments().getString("provinsiSekolah"));
        binding.textView23.setText(getArguments().getString("tahunLulus"));
        binding.textView24.setText(getArguments().getString("jmlNilai"));
        binding.textView25.setText(getArguments().getString("jmlMapel"));
        binding.textView26.setText(getArguments().getString("jurusanSekolah"));
        binding.textView27.setText(getArguments().getString("statusSekolah"));

        //Point D
        binding.textView28.setText(getArguments().getString("jmlSumbangan"));

        //Point E
        binding.textView29.setText(getArguments().getString("TidakMampu"));
        binding.textView30.setText(getArguments().getString("rekomendasi"));
        binding.textView31.setText(getArguments().getString("gaji"));
        binding.textView32.setText(getArguments().getString("tagihan"));
        binding.textView33.setText(getArguments().getString("prestasi"));
        binding.textView34.setText(getArguments().getString("raport"));
        binding.textView35.setText(getArguments().getString("ijasah"));

        return view;
    }
}