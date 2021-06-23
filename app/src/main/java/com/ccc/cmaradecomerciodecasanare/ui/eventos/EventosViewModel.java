package com.ccc.cmaradecomerciodecasanare.ui.eventos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EventosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EventosViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}