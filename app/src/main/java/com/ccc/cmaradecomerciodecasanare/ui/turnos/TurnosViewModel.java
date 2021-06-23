package com.ccc.cmaradecomerciodecasanare.ui.turnos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TurnosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TurnosViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}