package com.ccc.cmaradecomerciodecasanare.ui.salones;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SalonesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SalonesViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}