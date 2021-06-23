package com.ccc.cmaradecomerciodecasanare.ui.certificados;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CertificadosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CertificadosViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}