package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* compiled from: PickerFragment.java */
/* loaded from: classes3.dex */
abstract class m<S> extends Fragment {

    /* renamed from: f  reason: collision with root package name */
    protected final LinkedHashSet<l<S>> f9993f = new LinkedHashSet<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(l<S> lVar) {
        return this.f9993f.add(lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f9993f.clear();
    }
}
