package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.f;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: YearGridAdapter.java */
/* loaded from: classes3.dex */
public class v extends RecyclerView.h<b> {

    /* renamed from: a  reason: collision with root package name */
    private final f<?> f9999a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: YearGridAdapter.java */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f10000f;

        a(int i10) {
            this.f10000f = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v.this.f9999a.v(v.this.f9999a.m().f(Month.d(this.f10000f, v.this.f9999a.o().f9897m)));
            v.this.f9999a.w(f.l.DAY);
        }
    }

    /* compiled from: YearGridAdapter.java */
    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.f0 {

        /* renamed from: f  reason: collision with root package name */
        final TextView f10002f;

        b(TextView textView) {
            super(textView);
            this.f10002f = textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(f<?> fVar) {
        this.f9999a = fVar;
    }

    private View.OnClickListener g(int i10) {
        return new a(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f9999a.m().o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h(int i10) {
        return i10 - this.f9999a.m().n().f9898p;
    }

    int i(int i10) {
        return this.f9999a.m().n().f9898p + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        com.google.android.material.datepicker.a aVar;
        int i11 = i(i10);
        bVar.f10002f.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i11)));
        TextView textView = bVar.f10002f;
        textView.setContentDescription(d.e(textView.getContext(), i11));
        com.google.android.material.datepicker.b n10 = this.f9999a.n();
        Calendar i12 = u.i();
        if (i12.get(1) == i11) {
            aVar = n10.f9914f;
        } else {
            aVar = n10.f9912d;
        }
        Iterator<Long> it = this.f9999a.p().x0().iterator();
        while (it.hasNext()) {
            i12.setTimeInMillis(it.next().longValue());
            if (i12.get(1) == i11) {
                aVar = n10.f9913e;
            }
        }
        aVar.d(bVar.f10002f);
        bVar.f10002f.setOnClickListener(g(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: k  reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(v6.h.f24760t, viewGroup, false));
    }
}
