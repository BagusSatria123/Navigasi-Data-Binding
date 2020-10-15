package com.bagus.navigation_bla;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import com.bagus.navigation_bla.dataModel.FormulirMahasiswa;
import com.bagus.navigation_bla.databinding.FragmentStartBinding;


public class StartFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.fragment_start, container, false);
        final FragmentStartBinding binding = FragmentStartBinding.inflate(inflater, container, false);
        final View view = binding.getRoot();



        binding.radioGroupJenisKelamin.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group1, int checkedId1) {
                switch (checkedId1) {
                    case R.id.radioLakiLaki://radiobuttonID
                        //do what you want
                        break;
                    case R.id.radioPerempuan://radiobuttonID
                        //do what you want
                        break;
                }
            }
        });

        binding.radioGroupKewarganegaraan.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group1, int checkedId1) {
                switch (checkedId1) {
                    case R.id.radioWNI://radiobuttonID
                        //do what you want
                        break;
                    case R.id.radioWNA://radiobuttonID
                        //do what you want
                        break;
                }
            }
        });


        binding.StartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = binding.radioGroupJenisKelamin.getCheckedRadioButtonId();

                Bundle bundle = new Bundle();

                //Point A
                bundle.putString("namaMahasiswa", binding.edtNama.getText().toString());

                if(binding.radioLakiLaki.isChecked()){
                    bundle.putString("jenisKelamin", binding.radioLakiLaki.getText().toString());
                }else{
                    bundle.putString("jenisKelamin", binding.radioPerempuan.getText().toString());
                }

                bundle.putString("statusKawin", binding.spinnerStatus.getSelectedItem().toString());
                bundle.putString("agama", binding.spinnerAgama.getSelectedItem().toString());

                if(binding.radioWNI.isChecked()){
                    bundle.putString("kewarganegaraan", binding.radioWNI.getText().toString());
                }else{
                    bundle.putString("kewarganegaraan", binding.radioWNA.getText().toString());
                }

                bundle.putString("alamatSurat", binding.edtAlamatSurat.getText().toString());
                bundle.putString("alamatAsal", binding.edtAlamatAsal.getText().toString());
                bundle.putString("kota", binding.edtkabkota.getText().toString());
                bundle.putString("provinsi", binding.edtPropinsi.getText().toString());
                bundle.putString("noRumah", binding.edtNoTelp.getText().toString());
                bundle.putString("noHp", binding.edtNoHP.getText().toString());
                bundle.putString("email", binding.edtEmail.getText().toString());
                bundle.putString("namaOrtu", binding.edtNamaOrtu.getText().toString());
                bundle.putString("asalPerguruan", binding.edtAsalPT.getText().toString());
                bundle.putString("prodi", binding.edtAsalPS.getText().toString());
                bundle.putString("akreditasi", binding.statusakreditasi.getText().toString());


                //Point B
                bundle.putString("pilihanA", binding.radioWNI.getText().toString());
                bundle.putString("pilihanB", binding.radioWNA.getText().toString());

                //Point C
                bundle.putString("asalSekolah", binding.edtAlamatSekolah.getText().toString());
                bundle.putString("alamatSekolah", binding.edtAlamatAsal.getText().toString());
                bundle.putString("kotaSekolah", binding.edtKabKotaAlmtSekl.getText().toString());
                bundle.putString("provinsiSekolah", binding.edtPropinsiSekolah.getText().toString());
                bundle.putString("tahunLulus", binding.edtTahun.getText().toString());
                bundle.putString("jmlNilai", binding.edtJmlNilai.getText().toString());
                bundle.putString("jmlMapel", binding.edtJmlMataPelajaran.getText().toString());
                bundle.putString("jurusanSekolah", binding.spinnerJurusan.getSelectedItem().toString());
                bundle.putString("statusSekolah", binding.radioNegeri.getText().toString());

                //Point D
                bundle.putString("jmlSumbangan", binding.edtPartisipasi .getText().toString());

                //Point E

                if(binding.pengajuan1.isChecked()){
                    bundle.putString("TidakMampu", "Terkumpul");
                }else if(!binding.pengajuan1.isChecked()){
                    bundle.putString("TidakMampu", "Tidak Terkumpul");
                }if(binding.pengajuan6.isChecked()){
                    bundle.putString("rekomendasi", "Terkumpul");
                }else if(!binding.pengajuan6.isChecked()){
                    bundle.putString("rekomendasi", "Tidak Terkumpul");
                }if(binding.pengajuan2.isChecked()){
                    bundle.putString("gaji", "Terkumpul");
                }else if(!binding.pengajuan2.isChecked()){
                    bundle.putString("gaji", "Tidak Terkumpul");
                }if(binding.pengajuan3.isChecked()){
                    bundle.putString("tagihan", "Terkumpul");
                }else if(!binding.pengajuan3.isChecked()){
                    bundle.putString("tagihan", "Tidak Terkumpul");
                }if(binding.pengajuan4.isChecked()){
                    bundle.putString("prestasi", "Terkumpul");
                }else if(!binding.pengajuan4.isChecked()){
                    bundle.putString("prestasi", "Tidak Terkumpul");
                }if(binding.pengajuan7.isChecked()){
                    bundle.putString("raport", "Terkumpul");
                }else if(!binding.pengajuan7.isChecked()){
                    bundle.putString("raport", "Tidak Terkumpul");
                }if(binding.pengajuan5.isChecked()){
                    bundle.putString("ijasah", "Terkumpul");
                }else if(!binding.pengajuan5.isChecked()){
                    bundle.putString("ijasah", "Tidak Terkumpul");
                }


                Navigation.findNavController(view).navigate(R.id.gameFragment, bundle);
            }
        });

//        return binding.getRoot();
        return view;
    }
}