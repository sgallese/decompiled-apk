package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: MaterialTextInputPicker.java */
/* loaded from: classes3.dex */
public final class i<S> extends m<S> {

    /* renamed from: m  reason: collision with root package name */
    private int f9972m;

    /* renamed from: p  reason: collision with root package name */
    private DateSelector<S> f9973p;

    /* renamed from: q  reason: collision with root package name */
    private CalendarConstraints f9974q;

    /* compiled from: MaterialTextInputPicker.java */
    /* loaded from: classes3.dex */
    class a extends l<S> {
        a() {
        }

        @Override // com.google.android.material.datepicker.l
        public void a(S s10) {
            Iterator<l<S>> it = i.this.f9993f.iterator();
            while (it.hasNext()) {
                it.next().a(s10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> i<T> d(DateSelector<T> dateSelector, int i10, CalendarConstraints calendarConstraints) {
        i<T> iVar = new i<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        iVar.setArguments(bundle);
        return iVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f9972m = bundle.getInt("THEME_RES_ID_KEY");
        this.f9973p = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f9974q = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f9973p.Y(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f9972m)), viewGroup, bundle, this.f9974q, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f9972m);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f9973p);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f9974q);
    }
}
