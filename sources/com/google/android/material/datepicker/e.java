package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: DaysOfWeekAdapter.java */
/* loaded from: classes3.dex */
class e extends BaseAdapter {

    /* renamed from: q  reason: collision with root package name */
    private static final int f9917q;

    /* renamed from: f  reason: collision with root package name */
    private final Calendar f9918f;

    /* renamed from: m  reason: collision with root package name */
    private final int f9919m;

    /* renamed from: p  reason: collision with root package name */
    private final int f9920p;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 26) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        f9917q = i10;
    }

    public e() {
        Calendar k10 = u.k();
        this.f9918f = k10;
        this.f9919m = k10.getMaximum(7);
        this.f9920p = k10.getFirstDayOfWeek();
    }

    private int b(int i10) {
        int i11 = i10 + this.f9920p;
        int i12 = this.f9919m;
        if (i11 > i12) {
            return i11 - i12;
        }
        return i11;
    }

    @Override // android.widget.Adapter
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f9919m) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f9919m;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(v6.h.f24756p, viewGroup, false);
        }
        this.f9918f.set(7, b(i10));
        textView.setText(this.f9918f.getDisplayName(7, f9917q, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(v6.j.f24780p), this.f9918f.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i10) {
        Calendar k10 = u.k();
        this.f9918f = k10;
        this.f9919m = k10.getMaximum(7);
        this.f9920p = i10;
    }
}
