package com.ccc.cmaradecomerciodecasanare.ui.renovacion;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RenovacionViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RenovacionViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}