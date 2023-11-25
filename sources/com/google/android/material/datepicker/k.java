package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.p0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.f;

/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes3.dex */
class k extends RecyclerView.h<b> {

    /* renamed from: a  reason: collision with root package name */
    private final CalendarConstraints f9984a;

    /* renamed from: b  reason: collision with root package name */
    private final DateSelector<?> f9985b;

    /* renamed from: c  reason: collision with root package name */
    private final DayViewDecorator f9986c;

    /* renamed from: d  reason: collision with root package name */
    private final f.m f9987d;

    /* renamed from: e  reason: collision with root package name */
    private final int f9988e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MonthsPagerAdapter.java */
    /* loaded from: classes3.dex */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f9989f;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f9989f = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (this.f9989f.getAdapter().r(i10)) {
                k.this.f9987d.a(this.f9989f.getAdapter().getItem(i10).longValue());
            }
        }
    }

    /* compiled from: MonthsPagerAdapter.java */
    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.f0 {

        /* renamed from: f  reason: collision with root package name */
        final TextView f9991f;

        /* renamed from: m  reason: collision with root package name */
        final MaterialCalendarGridView f9992m;

        b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(v6.f.f24734w);
            this.f9991f = textView;
            p0.v0(textView, true);
            this.f9992m = (MaterialCalendarGridView) linearLayout.findViewById(v6.f.f24730s);
            if (!z10) {
                textView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, f.m mVar) {
        int i10;
        Month n10 = calendarConstraints.n();
        Month h10 = calendarConstraints.h();
        Month l10 = calendarConstraints.l();
        if (n10.compareTo(l10) <= 0) {
            if (l10.compareTo(h10) <= 0) {
                int q10 = j.f9976t * f.q(context);
                if (g.s(context)) {
                    i10 = f.q(context);
                } else {
                    i10 = 0;
                }
                this.f9988e = q10 + i10;
                this.f9984a = calendarConstraints;
                this.f9985b = dateSelector;
                this.f9986c = dayViewDecorator;
                this.f9987d = mVar;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month g(int i10) {
        return this.f9984a.n().p(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f9984a.k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return this.f9984a.n().p(i10).o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence h(int i10) {
        return g(i10).n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i(Month month) {
        return this.f9984a.n().q(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        Month p10 = this.f9984a.n().p(i10);
        bVar.f9991f.setText(p10.n());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f9992m.findViewById(v6.f.f24730s);
        if (materialCalendarGridView.getAdapter() != null && p10.equals(materialCalendarGridView.getAdapter().f9978f)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().q(materialCalendarGridView);
        } else {
            j jVar = new j(p10, this.f9985b, this.f9984a, this.f9986c);
            materialCalendarGridView.setNumColumns(p10.f9899q);
            materialCalendarGridView.setAdapter((ListAdapter) jVar);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: k  reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(v6.h.f24758r, viewGroup, false);
        if (g.s(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f9988e));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }
}
