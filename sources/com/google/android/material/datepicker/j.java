package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MonthAdapter.java */
/* loaded from: classes3.dex */
public class j extends BaseAdapter {

    /* renamed from: t  reason: collision with root package name */
    static final int f9976t = u.k().getMaximum(4);

    /* renamed from: u  reason: collision with root package name */
    private static final int f9977u = (u.k().getMaximum(5) + u.k().getMaximum(7)) - 1;

    /* renamed from: f  reason: collision with root package name */
    final Month f9978f;

    /* renamed from: m  reason: collision with root package name */
    final DateSelector<?> f9979m;

    /* renamed from: p  reason: collision with root package name */
    private Collection<Long> f9980p;

    /* renamed from: q  reason: collision with root package name */
    b f9981q;

    /* renamed from: r  reason: collision with root package name */
    final CalendarConstraints f9982r;

    /* renamed from: s  reason: collision with root package name */
    final DayViewDecorator f9983s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f9978f = month;
        this.f9979m = dateSelector;
        this.f9982r = calendarConstraints;
        this.f9983s = dayViewDecorator;
        this.f9980p = dateSelector.x0();
    }

    private String c(Context context, long j10) {
        return d.a(context, j10, l(j10), k(j10), g(j10));
    }

    private void f(Context context) {
        if (this.f9981q == null) {
            this.f9981q = new b(context);
        }
    }

    private boolean j(long j10) {
        Iterator<Long> it = this.f9979m.x0().iterator();
        while (it.hasNext()) {
            if (u.a(j10) == u.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private boolean l(long j10) {
        if (u.i().getTimeInMillis() == j10) {
            return true;
        }
        return false;
    }

    private void o(TextView textView, long j10, int i10) {
        a aVar;
        boolean z10;
        a aVar2;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String c10 = c(context, j10);
        textView.setContentDescription(c10);
        boolean p02 = this.f9982r.g().p0(j10);
        if (p02) {
            textView.setEnabled(true);
            boolean j11 = j(j10);
            textView.setSelected(j11);
            if (j11) {
                aVar2 = this.f9981q.f9910b;
            } else if (l(j10)) {
                aVar2 = this.f9981q.f9911c;
            } else {
                aVar2 = this.f9981q.f9909a;
            }
            aVar = aVar2;
            z10 = j11;
        } else {
            textView.setEnabled(false);
            aVar = this.f9981q.f9915g;
            z10 = false;
        }
        DayViewDecorator dayViewDecorator = this.f9983s;
        if (dayViewDecorator != null && i10 != -1) {
            Month month = this.f9978f;
            int i11 = month.f9898p;
            int i12 = month.f9897m;
            boolean z11 = z10;
            aVar.e(textView, dayViewDecorator.a(context, i11, i12, i10, p02, z11));
            Drawable c11 = this.f9983s.c(context, i11, i12, i10, p02, z11);
            Drawable e10 = this.f9983s.e(context, i11, i12, i10, p02, z11);
            Drawable d10 = this.f9983s.d(context, i11, i12, i10, p02, z10);
            boolean z12 = z10;
            textView.setCompoundDrawables(c11, e10, d10, this.f9983s.b(context, i11, i12, i10, p02, z12));
            textView.setContentDescription(this.f9983s.f(context, i11, i12, i10, p02, z12, c10));
            return;
        }
        aVar.d(textView);
    }

    private void p(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (Month.f(j10).equals(this.f9978f)) {
            int l10 = this.f9978f.l(j10);
            o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(l10) - materialCalendarGridView.getFirstVisiblePosition()), j10, l10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i10) {
        return b() + (i10 - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f9978f.i(this.f9982r.i());
    }

    @Override // android.widget.Adapter
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public Long getItem(int i10) {
        if (i10 >= b() && i10 <= m()) {
            return Long.valueOf(this.f9978f.k(n(i10)));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    @Override // android.widget.Adapter
    /* renamed from: e  reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.f(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = v6.h.f24755o
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            com.google.android.material.datepicker.Month r8 = r5.f9978f
            int r2 = r8.f9900r
            if (r7 < r2) goto L2d
            goto L54
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L5d
        L54:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r0
        L64:
            long r1 = r6.longValue()
            r5.o(r0, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.j.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    boolean g(long j10) {
        Iterator<androidx.core.util.d<Long, Long>> it = this.f9979m.m().iterator();
        while (it.hasNext()) {
            Long l10 = it.next().f4049b;
            if (l10 != null && l10.longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f9977u;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f9978f.f9899q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(int i10) {
        if (i10 % this.f9978f.f9899q == 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i(int i10) {
        if ((i10 + 1) % this.f9978f.f9899q == 0) {
            return true;
        }
        return false;
    }

    boolean k(long j10) {
        Iterator<androidx.core.util.d<Long, Long>> it = this.f9979m.m().iterator();
        while (it.hasNext()) {
            Long l10 = it.next().f4048a;
            if (l10 != null && l10.longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m() {
        return (b() + this.f9978f.f9900r) - 1;
    }

    int n(int i10) {
        return (i10 - b()) + 1;
    }

    public void q(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f9980p.iterator();
        while (it.hasNext()) {
            p(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.f9979m;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.x0().iterator();
            while (it2.hasNext()) {
                p(materialCalendarGridView, it2.next().longValue());
            }
            this.f9980p = this.f9979m.x0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(int i10) {
        if (i10 >= b() && i10 <= m()) {
            return true;
        }
        return false;
    }
}
