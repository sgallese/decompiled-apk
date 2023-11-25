package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.accessibility.n0;
import androidx.core.view.p0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes3.dex */
public final class f<S> extends com.google.android.material.datepicker.m<S> {
    static final Object B = "MONTHS_VIEW_GROUP_TAG";
    static final Object C = "NAVIGATION_PREV_TAG";
    static final Object D = "NAVIGATION_NEXT_TAG";
    static final Object E = "SELECTOR_TOGGLE_TAG";
    private View A;

    /* renamed from: m  reason: collision with root package name */
    private int f9921m;

    /* renamed from: p  reason: collision with root package name */
    private DateSelector<S> f9922p;

    /* renamed from: q  reason: collision with root package name */
    private CalendarConstraints f9923q;

    /* renamed from: r  reason: collision with root package name */
    private DayViewDecorator f9924r;

    /* renamed from: s  reason: collision with root package name */
    private Month f9925s;

    /* renamed from: t  reason: collision with root package name */
    private l f9926t;

    /* renamed from: u  reason: collision with root package name */
    private com.google.android.material.datepicker.b f9927u;

    /* renamed from: v  reason: collision with root package name */
    private RecyclerView f9928v;

    /* renamed from: w  reason: collision with root package name */
    private RecyclerView f9929w;

    /* renamed from: x  reason: collision with root package name */
    private View f9930x;

    /* renamed from: y  reason: collision with root package name */
    private View f9931y;

    /* renamed from: z  reason: collision with root package name */
    private View f9932z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.k f9933f;

        a(com.google.android.material.datepicker.k kVar) {
            this.f9933f = kVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int k22 = f.this.s().k2() - 1;
            if (k22 >= 0) {
                f.this.v(this.f9933f.g(k22));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f9935f;

        b(int i10) {
            this.f9935f = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f9929w.smoothScrollToPosition(this.f9935f);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void g(View view, n0 n0Var) {
            super.g(view, n0Var);
            n0Var.p0(null);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    class d extends n {
        final /* synthetic */ int V;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.V = i11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void W1(RecyclerView.b0 b0Var, int[] iArr) {
            if (this.V == 0) {
                iArr[0] = f.this.f9929w.getWidth();
                iArr[1] = f.this.f9929w.getWidth();
                return;
            }
            iArr[0] = f.this.f9929w.getHeight();
            iArr[1] = f.this.f9929w.getHeight();
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    class e implements m {
        e() {
        }

        @Override // com.google.android.material.datepicker.f.m
        public void a(long j10) {
            if (f.this.f9923q.g().p0(j10)) {
                f.this.f9922p.N0(j10);
                Iterator<com.google.android.material.datepicker.l<S>> it = f.this.f9993f.iterator();
                while (it.hasNext()) {
                    it.next().a((S) f.this.f9922p.C0());
                }
                f.this.f9929w.getAdapter().notifyDataSetChanged();
                if (f.this.f9928v != null) {
                    f.this.f9928v.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.f$f  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0236f extends androidx.core.view.a {
        C0236f() {
        }

        @Override // androidx.core.view.a
        public void g(View view, n0 n0Var) {
            super.g(view, n0Var);
            n0Var.P0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    public class g extends RecyclerView.o {

        /* renamed from: a  reason: collision with root package name */
        private final Calendar f9940a = u.k();

        /* renamed from: b  reason: collision with root package name */
        private final Calendar f9941b = u.k();

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            int i10;
            int width;
            if ((recyclerView.getAdapter() instanceof v) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                v vVar = (v) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (androidx.core.util.d<Long, Long> dVar : f.this.f9922p.m()) {
                    Long l10 = dVar.f4048a;
                    if (l10 != null && dVar.f4049b != null) {
                        this.f9940a.setTimeInMillis(l10.longValue());
                        this.f9941b.setTimeInMillis(dVar.f4049b.longValue());
                        int h10 = vVar.h(this.f9940a.get(1));
                        int h11 = vVar.h(this.f9941b.get(1));
                        View O = gridLayoutManager.O(h10);
                        View O2 = gridLayoutManager.O(h11);
                        int e32 = h10 / gridLayoutManager.e3();
                        int e33 = h11 / gridLayoutManager.e3();
                        for (int i11 = e32; i11 <= e33; i11++) {
                            View O3 = gridLayoutManager.O(gridLayoutManager.e3() * i11);
                            if (O3 != null) {
                                int top = O3.getTop() + f.this.f9927u.f9912d.c();
                                int bottom = O3.getBottom() - f.this.f9927u.f9912d.b();
                                if (i11 == e32 && O != null) {
                                    i10 = O.getLeft() + (O.getWidth() / 2);
                                } else {
                                    i10 = 0;
                                }
                                if (i11 == e33 && O2 != null) {
                                    width = O2.getLeft() + (O2.getWidth() / 2);
                                } else {
                                    width = recyclerView.getWidth();
                                }
                                canvas.drawRect(i10, top, width, bottom, f.this.f9927u.f9916h);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    public class h extends androidx.core.view.a {
        h() {
        }

        @Override // androidx.core.view.a
        public void g(View view, n0 n0Var) {
            String string;
            super.g(view, n0Var);
            if (f.this.A.getVisibility() == 0) {
                string = f.this.getString(v6.j.f24789y);
            } else {
                string = f.this.getString(v6.j.f24787w);
            }
            n0Var.A0(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    public class i extends RecyclerView.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.k f9944a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MaterialButton f9945b;

        i(com.google.android.material.datepicker.k kVar, MaterialButton materialButton) {
            this.f9944a = kVar;
            this.f9945b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.f9945b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            int k22;
            if (i10 < 0) {
                k22 = f.this.s().i2();
            } else {
                k22 = f.this.s().k2();
            }
            f.this.f9925s = this.f9944a.g(k22);
            this.f9945b.setText(this.f9944a.h(k22));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    public class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f.this.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    public class k implements View.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.k f9948f;

        k(com.google.android.material.datepicker.k kVar) {
            this.f9948f = kVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i22 = f.this.s().i2() + 1;
            if (i22 < f.this.f9929w.getAdapter().getItemCount()) {
                f.this.v(this.f9948f.g(i22));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    public enum l {
        DAY,
        YEAR
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    public interface m {
        void a(long j10);
    }

    private void k(View view, com.google.android.material.datepicker.k kVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(v6.f.f24731t);
        materialButton.setTag(E);
        p0.u0(materialButton, new h());
        View findViewById = view.findViewById(v6.f.f24733v);
        this.f9930x = findViewById;
        findViewById.setTag(C);
        View findViewById2 = view.findViewById(v6.f.f24732u);
        this.f9931y = findViewById2;
        findViewById2.setTag(D);
        this.f9932z = view.findViewById(v6.f.D);
        this.A = view.findViewById(v6.f.f24736y);
        w(l.DAY);
        materialButton.setText(this.f9925s.n());
        this.f9929w.addOnScrollListener(new i(kVar, materialButton));
        materialButton.setOnClickListener(new j());
        this.f9931y.setOnClickListener(new k(kVar));
        this.f9930x.setOnClickListener(new a(kVar));
    }

    private RecyclerView.o l() {
        return new g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(Context context) {
        return context.getResources().getDimensionPixelSize(v6.d.R);
    }

    private static int r(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(v6.d.Y) + resources.getDimensionPixelOffset(v6.d.Z) + resources.getDimensionPixelOffset(v6.d.X);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(v6.d.T);
        int i10 = com.google.android.material.datepicker.j.f9976t;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(v6.d.R) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(v6.d.W)) + resources.getDimensionPixelOffset(v6.d.P);
    }

    public static <T> f<T> t(DateSelector<T> dateSelector, int i10, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        f<T> fVar = new f<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", dayViewDecorator);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.l());
        fVar.setArguments(bundle);
        return fVar;
    }

    private void u(int i10) {
        this.f9929w.post(new b(i10));
    }

    private void x() {
        p0.u0(this.f9929w, new C0236f());
    }

    @Override // com.google.android.material.datepicker.m
    public boolean b(com.google.android.material.datepicker.l<S> lVar) {
        return super.b(lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CalendarConstraints m() {
        return this.f9923q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.material.datepicker.b n() {
        return this.f9927u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month o() {
        return this.f9925s;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f9921m = bundle.getInt("THEME_RES_ID_KEY");
        this.f9922p = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f9923q = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f9924r = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f9925s = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        com.google.android.material.datepicker.e eVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f9921m);
        this.f9927u = new com.google.android.material.datepicker.b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month n10 = this.f9923q.n();
        if (com.google.android.material.datepicker.g.s(contextThemeWrapper)) {
            i10 = v6.h.f24759s;
            i11 = 1;
        } else {
            i10 = v6.h.f24757q;
            i11 = 0;
        }
        View inflate = cloneInContext.inflate(i10, viewGroup, false);
        inflate.setMinimumHeight(r(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(v6.f.f24737z);
        p0.u0(gridView, new c());
        int i12 = this.f9923q.i();
        if (i12 > 0) {
            eVar = new com.google.android.material.datepicker.e(i12);
        } else {
            eVar = new com.google.android.material.datepicker.e();
        }
        gridView.setAdapter((ListAdapter) eVar);
        gridView.setNumColumns(n10.f9899q);
        gridView.setEnabled(false);
        this.f9929w = (RecyclerView) inflate.findViewById(v6.f.C);
        this.f9929w.setLayoutManager(new d(getContext(), i11, false, i11));
        this.f9929w.setTag(B);
        com.google.android.material.datepicker.k kVar = new com.google.android.material.datepicker.k(contextThemeWrapper, this.f9922p, this.f9923q, this.f9924r, new e());
        this.f9929w.setAdapter(kVar);
        int integer = contextThemeWrapper.getResources().getInteger(v6.g.f24740c);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(v6.f.D);
        this.f9928v = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f9928v.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f9928v.setAdapter(new v(this));
            this.f9928v.addItemDecoration(l());
        }
        if (inflate.findViewById(v6.f.f24731t) != null) {
            k(inflate, kVar);
        }
        if (!com.google.android.material.datepicker.g.s(contextThemeWrapper)) {
            new androidx.recyclerview.widget.v().b(this.f9929w);
        }
        this.f9929w.scrollToPosition(kVar.i(this.f9925s));
        x();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f9921m);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f9922p);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f9923q);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f9924r);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f9925s);
    }

    public DateSelector<S> p() {
        return this.f9922p;
    }

    LinearLayoutManager s() {
        return (LinearLayoutManager) this.f9929w.getLayoutManager();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(Month month) {
        boolean z10;
        com.google.android.material.datepicker.k kVar = (com.google.android.material.datepicker.k) this.f9929w.getAdapter();
        int i10 = kVar.i(month);
        int i11 = i10 - kVar.i(this.f9925s);
        boolean z11 = true;
        if (Math.abs(i11) > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 <= 0) {
            z11 = false;
        }
        this.f9925s = month;
        if (z10 && z11) {
            this.f9929w.scrollToPosition(i10 - 3);
            u(i10);
        } else if (z10) {
            this.f9929w.scrollToPosition(i10 + 3);
            u(i10);
        } else {
            u(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(l lVar) {
        this.f9926t = lVar;
        if (lVar == l.YEAR) {
            this.f9928v.getLayoutManager().H1(((v) this.f9928v.getAdapter()).h(this.f9925s.f9898p));
            this.f9932z.setVisibility(0);
            this.A.setVisibility(8);
            this.f9930x.setVisibility(8);
            this.f9931y.setVisibility(8);
        } else if (lVar == l.DAY) {
            this.f9932z.setVisibility(8);
            this.A.setVisibility(0);
            this.f9930x.setVisibility(0);
            this.f9931y.setVisibility(0);
            v(this.f9925s);
        }
    }

    void y() {
        l lVar = this.f9926t;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            w(l.DAY);
        } else if (lVar == l.DAY) {
            w(lVar2);
        }
    }
}
