package com.ccc.cmaradecomerciodecasanare.ui.tramites;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TramitesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TramitesViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}