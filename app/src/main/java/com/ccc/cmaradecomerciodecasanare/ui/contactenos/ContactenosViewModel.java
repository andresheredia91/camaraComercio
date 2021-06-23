package com.ccc.cmaradecomerciodecasanare.ui.contactenos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContactenosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ContactenosViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}