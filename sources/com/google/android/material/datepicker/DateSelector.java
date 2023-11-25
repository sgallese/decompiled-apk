package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

/* loaded from: classes3.dex */
public interface DateSelector<S> extends Parcelable {
    S C0();

    void N0(long j10);

    String V0();

    View Y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, l<S> lVar);

    String i0(Context context);

    String j(Context context);

    int l0(Context context);

    Collection<androidx.core.util.d<Long, Long>> m();

    boolean s0();

    Collection<Long> x0();
}
