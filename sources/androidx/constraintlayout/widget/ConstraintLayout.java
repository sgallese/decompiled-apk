package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import o2.d;
import o2.e;
import okhttp3.internal.http2.Http2Connection;
import p2.b;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private int A;
    private int B;
    int C;
    int D;
    int E;
    int F;
    private SparseArray<o2.e> G;
    c H;
    private int I;
    private int J;

    /* renamed from: f  reason: collision with root package name */
    SparseArray<View> f3207f;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<androidx.constraintlayout.widget.b> f3208m;

    /* renamed from: p  reason: collision with root package name */
    protected o2.f f3209p;

    /* renamed from: q  reason: collision with root package name */
    private int f3210q;

    /* renamed from: r  reason: collision with root package name */
    private int f3211r;

    /* renamed from: s  reason: collision with root package name */
    private int f3212s;

    /* renamed from: t  reason: collision with root package name */
    private int f3213t;

    /* renamed from: u  reason: collision with root package name */
    protected boolean f3214u;

    /* renamed from: v  reason: collision with root package name */
    private int f3215v;

    /* renamed from: w  reason: collision with root package name */
    private d f3216w;

    /* renamed from: x  reason: collision with root package name */
    protected androidx.constraintlayout.widget.c f3217x;

    /* renamed from: y  reason: collision with root package name */
    private int f3218y;

    /* renamed from: z  reason: collision with root package name */
    private HashMap<String, Integer> f3219z;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3220a;

        static {
            int[] iArr = new int[e.b.values().length];
            f3220a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3220a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3220a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3220a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements b.InterfaceC0474b {

        /* renamed from: a  reason: collision with root package name */
        ConstraintLayout f3263a;

        /* renamed from: b  reason: collision with root package name */
        int f3264b;

        /* renamed from: c  reason: collision with root package name */
        int f3265c;

        /* renamed from: d  reason: collision with root package name */
        int f3266d;

        /* renamed from: e  reason: collision with root package name */
        int f3267e;

        /* renamed from: f  reason: collision with root package name */
        int f3268f;

        /* renamed from: g  reason: collision with root package name */
        int f3269g;

        public c(ConstraintLayout constraintLayout) {
            this.f3263a = constraintLayout;
        }

        @Override // p2.b.InterfaceC0474b
        public final void a() {
            int childCount = this.f3263a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f3263a.getChildAt(i10);
                if (childAt instanceof h) {
                    ((h) childAt).a(this.f3263a);
                }
            }
            int size = this.f3263a.f3208m.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.b) this.f3263a.f3208m.get(i11)).j(this.f3263a);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x016b A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x01ae  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x01db  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x01e3  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x01e8  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x01ed  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x01f5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:143:0x0202 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:146:0x020d A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:152:0x0219  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x021f  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x0235  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0237  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x023c  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x024a  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x024c  */
        /* JADX WARN: Removed duplicated region for block: B:171:0x024f  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0158  */
        @Override // p2.b.InterfaceC0474b
        @android.annotation.SuppressLint({"WrongCall"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(o2.e r20, p2.b.a r21) {
            /*
                Method dump skipped, instructions count: 612
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c.b(o2.e, p2.b$a):void");
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f3264b = i12;
            this.f3265c = i13;
            this.f3266d = i14;
            this.f3267e = i15;
            this.f3268f = i10;
            this.f3269g = i11;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3207f = new SparseArray<>();
        this.f3208m = new ArrayList<>(4);
        this.f3209p = new o2.f();
        this.f3210q = 0;
        this.f3211r = 0;
        this.f3212s = Integer.MAX_VALUE;
        this.f3213t = Integer.MAX_VALUE;
        this.f3214u = true;
        this.f3215v = 263;
        this.f3216w = null;
        this.f3217x = null;
        this.f3218y = -1;
        this.f3219z = new HashMap<>();
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = 0;
        this.F = 0;
        this.G = new SparseArray<>();
        this.H = new c(this);
        this.I = 0;
        this.J = 0;
        j(attributeSet, 0, 0);
    }

    private final o2.e g(int i10) {
        if (i10 == 0) {
            return this.f3209p;
        }
        View view = this.f3207f.get(i10);
        if (view == null && (view = findViewById(i10)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f3209p;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f3248n0;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    private void j(AttributeSet attributeSet, int i10, int i11) {
        this.f3209p.c0(this);
        this.f3209p.f1(this.H);
        this.f3207f.put(getId(), this);
        this.f3216w = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.f3394a1, i10, i11);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == j.f3464k1) {
                    this.f3210q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3210q);
                } else if (index == j.f3471l1) {
                    this.f3211r = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3211r);
                } else if (index == j.f3450i1) {
                    this.f3212s = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3212s);
                } else if (index == j.f3457j1) {
                    this.f3213t = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3213t);
                } else if (index == j.L2) {
                    this.f3215v = obtainStyledAttributes.getInt(index, this.f3215v);
                } else if (index == j.M1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f3217x = null;
                        }
                    }
                } else if (index == j.f3520s1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.f3216w = dVar;
                        dVar.l(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f3216w = null;
                    }
                    this.f3218y = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f3209p.g1(this.f3215v);
    }

    private void l() {
        this.f3214u = true;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = 0;
        this.F = 0;
    }

    private void p() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            o2.e i11 = i(getChildAt(i10));
            if (i11 != null) {
                i11.Y();
            }
        }
        if (isInEditMode) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    g(childAt.getId()).d0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f3218y != -1) {
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt2 = getChildAt(i13);
                if (childAt2.getId() == this.f3218y && (childAt2 instanceof e)) {
                    this.f3216w = ((e) childAt2).getConstraintSet();
                }
            }
        }
        d dVar = this.f3216w;
        if (dVar != null) {
            dVar.d(this, true);
        }
        this.f3209p.M0();
        int size = this.f3208m.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                this.f3208m.get(i14).l(this);
            }
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt3 = getChildAt(i15);
            if (childAt3 instanceof h) {
                ((h) childAt3).b(this);
            }
        }
        this.G.clear();
        this.G.put(0, this.f3209p);
        this.G.put(getId(), this.f3209p);
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt4 = getChildAt(i16);
            this.G.put(childAt4.getId(), i(childAt4));
        }
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt5 = getChildAt(i17);
            o2.e i18 = i(childAt5);
            if (i18 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f3209p.b(i18);
                c(isInEditMode, childAt5, i18, bVar, this.G);
            }
        }
    }

    private boolean s() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            p();
        }
        return z10;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
    }

    protected void c(boolean z10, View view, o2.e eVar, b bVar, SparseArray<o2.e> sparseArray) {
        float f10;
        o2.e eVar2;
        o2.e eVar3;
        o2.e eVar4;
        o2.e eVar5;
        int i10;
        bVar.a();
        bVar.f3250o0 = false;
        eVar.D0(view.getVisibility());
        if (bVar.f3224b0) {
            eVar.p0(true);
            eVar.D0(8);
        }
        eVar.c0(view);
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view).h(eVar, this.f3209p.a1());
        }
        if (bVar.Z) {
            o2.h hVar = (o2.h) eVar;
            int i11 = bVar.f3242k0;
            int i12 = bVar.f3244l0;
            float f11 = bVar.f3246m0;
            if (f11 != -1.0f) {
                hVar.Q0(f11);
                return;
            } else if (i11 != -1) {
                hVar.O0(i11);
                return;
            } else if (i12 != -1) {
                hVar.P0(i12);
                return;
            } else {
                return;
            }
        }
        int i13 = bVar.f3228d0;
        int i14 = bVar.f3230e0;
        int i15 = bVar.f3232f0;
        int i16 = bVar.f3234g0;
        int i17 = bVar.f3236h0;
        int i18 = bVar.f3238i0;
        float f12 = bVar.f3240j0;
        int i19 = bVar.f3245m;
        if (i19 != -1) {
            o2.e eVar6 = sparseArray.get(i19);
            if (eVar6 != null) {
                eVar.k(eVar6, bVar.f3249o, bVar.f3247n);
            }
        } else {
            if (i13 != -1) {
                o2.e eVar7 = sparseArray.get(i13);
                if (eVar7 != null) {
                    d.b bVar2 = d.b.LEFT;
                    f10 = f12;
                    eVar.T(bVar2, eVar7, bVar2, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i17);
                } else {
                    f10 = f12;
                }
            } else {
                f10 = f12;
                if (i14 != -1 && (eVar2 = sparseArray.get(i14)) != null) {
                    eVar.T(d.b.LEFT, eVar2, d.b.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i17);
                }
            }
            if (i15 != -1) {
                o2.e eVar8 = sparseArray.get(i15);
                if (eVar8 != null) {
                    eVar.T(d.b.RIGHT, eVar8, d.b.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i18);
                }
            } else if (i16 != -1 && (eVar3 = sparseArray.get(i16)) != null) {
                d.b bVar3 = d.b.RIGHT;
                eVar.T(bVar3, eVar3, bVar3, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i18);
            }
            int i20 = bVar.f3235h;
            if (i20 != -1) {
                o2.e eVar9 = sparseArray.get(i20);
                if (eVar9 != null) {
                    d.b bVar4 = d.b.TOP;
                    eVar.T(bVar4, eVar9, bVar4, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f3256u);
                }
            } else {
                int i21 = bVar.f3237i;
                if (i21 != -1 && (eVar4 = sparseArray.get(i21)) != null) {
                    eVar.T(d.b.TOP, eVar4, d.b.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f3256u);
                }
            }
            int i22 = bVar.f3239j;
            if (i22 != -1) {
                o2.e eVar10 = sparseArray.get(i22);
                if (eVar10 != null) {
                    eVar.T(d.b.BOTTOM, eVar10, d.b.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f3258w);
                }
            } else {
                int i23 = bVar.f3241k;
                if (i23 != -1 && (eVar5 = sparseArray.get(i23)) != null) {
                    d.b bVar5 = d.b.BOTTOM;
                    eVar.T(bVar5, eVar5, bVar5, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f3258w);
                }
            }
            int i24 = bVar.f3243l;
            if (i24 != -1) {
                View view2 = this.f3207f.get(i24);
                o2.e eVar11 = sparseArray.get(bVar.f3243l);
                if (eVar11 != null && view2 != null && (view2.getLayoutParams() instanceof b)) {
                    b bVar6 = (b) view2.getLayoutParams();
                    bVar.Y = true;
                    bVar6.Y = true;
                    d.b bVar7 = d.b.BASELINE;
                    eVar.m(bVar7).b(eVar11.m(bVar7), 0, -1, true);
                    eVar.g0(true);
                    bVar6.f3248n0.g0(true);
                    eVar.m(d.b.TOP).l();
                    eVar.m(d.b.BOTTOM).l();
                }
            }
            float f13 = f10;
            if (f13 >= 0.0f) {
                eVar.i0(f13);
            }
            float f14 = bVar.A;
            if (f14 >= 0.0f) {
                eVar.x0(f14);
            }
        }
        if (z10 && ((i10 = bVar.Q) != -1 || bVar.R != -1)) {
            eVar.v0(i10, bVar.R);
        }
        if (!bVar.W) {
            if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
                if (bVar.T) {
                    eVar.l0(e.b.MATCH_CONSTRAINT);
                } else {
                    eVar.l0(e.b.MATCH_PARENT);
                }
                eVar.m(d.b.LEFT).f20374e = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                eVar.m(d.b.RIGHT).f20374e = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            } else {
                eVar.l0(e.b.MATCH_CONSTRAINT);
                eVar.E0(0);
            }
        } else {
            eVar.l0(e.b.FIXED);
            eVar.E0(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                eVar.l0(e.b.WRAP_CONTENT);
            }
        }
        if (!bVar.X) {
            if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
                if (bVar.U) {
                    eVar.A0(e.b.MATCH_CONSTRAINT);
                } else {
                    eVar.A0(e.b.MATCH_PARENT);
                }
                eVar.m(d.b.TOP).f20374e = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                eVar.m(d.b.BOTTOM).f20374e = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            } else {
                eVar.A0(e.b.MATCH_CONSTRAINT);
                eVar.h0(0);
            }
        } else {
            eVar.A0(e.b.FIXED);
            eVar.h0(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                eVar.A0(e.b.WRAP_CONTENT);
            }
        }
        eVar.e0(bVar.B);
        eVar.n0(bVar.E);
        eVar.C0(bVar.F);
        eVar.j0(bVar.G);
        eVar.y0(bVar.H);
        eVar.m0(bVar.I, bVar.K, bVar.M, bVar.O);
        eVar.B0(bVar.J, bVar.L, bVar.N, bVar.P);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.f3208m;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f3208m.get(i10).k(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((parseInt / 1080.0f) * width);
                        int i13 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i12;
                        float f11 = i13;
                        float f12 = i12 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float parseInt4 = i13 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, parseInt4, paint);
                        canvas.drawLine(f12, parseInt4, f10, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, parseInt4, paint);
                        canvas.drawLine(f10, parseInt4, f12, f11, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: e  reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i10, Object obj) {
        if (i10 == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.f3219z;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.f3219z.get(str);
            }
            return null;
        }
        return null;
    }

    @Override // android.view.View
    public void forceLayout() {
        l();
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.f3213t;
    }

    public int getMaxWidth() {
        return this.f3212s;
    }

    public int getMinHeight() {
        return this.f3211r;
    }

    public int getMinWidth() {
        return this.f3210q;
    }

    public int getOptimizationLevel() {
        return this.f3209p.V0();
    }

    public View h(int i10) {
        return this.f3207f.get(i10);
    }

    public final o2.e i(View view) {
        if (view == this) {
            return this.f3209p;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f3248n0;
    }

    protected boolean k() {
        boolean z10;
        if ((getContext().getApplicationInfo().flags & 4194304) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    protected void m(int i10) {
        this.f3217x = new androidx.constraintlayout.widget.c(getContext(), this, i10);
    }

    protected void n(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.H;
        int i14 = cVar.f3267e;
        int resolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f3266d, i10, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int min = Math.min(this.f3212s, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f3213t, resolveSizeAndState2);
        if (z10) {
            min |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z11) {
            min2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(min, min2);
        this.A = min;
        this.B = min2;
    }

    protected void o(o2.f fVar, int i10, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i14 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.H.c(i11, i12, max, max2, paddingWidth, i14);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            i13 = Math.max(0, getPaddingLeft());
        } else if (k()) {
            i13 = max4;
        } else {
            i13 = max3;
        }
        int i15 = size - paddingWidth;
        int i16 = size2 - i14;
        r(fVar, mode, i15, mode2, i16);
        fVar.c1(i10, mode, i15, mode2, i16, this.A, this.B, i13, max);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            o2.e eVar = bVar.f3248n0;
            if ((childAt.getVisibility() != 8 || bVar.Z || bVar.f3222a0 || bVar.f3226c0 || isInEditMode) && !bVar.f3224b0) {
                int Q = eVar.Q();
                int R = eVar.R();
                int P = eVar.P() + Q;
                int v10 = eVar.v() + R;
                childAt.layout(Q, R, P, v10);
                if ((childAt instanceof h) && (content = ((h) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(Q, R, P, v10);
                }
            }
        }
        int size = this.f3208m.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.f3208m.get(i15).i(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        this.I = i10;
        this.J = i11;
        this.f3209p.h1(k());
        if (this.f3214u) {
            this.f3214u = false;
            if (s()) {
                this.f3209p.j1();
            }
        }
        o(this.f3209p, this.f3215v, i10, i11);
        n(i10, i11, this.f3209p.P(), this.f3209p.v(), this.f3209p.b1(), this.f3209p.Z0());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        o2.e i10 = i(view);
        if ((view instanceof g) && !(i10 instanceof o2.h)) {
            b bVar = (b) view.getLayoutParams();
            o2.h hVar = new o2.h();
            bVar.f3248n0 = hVar;
            bVar.Z = true;
            hVar.R0(bVar.S);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.m();
            ((b) view.getLayoutParams()).f3222a0 = true;
            if (!this.f3208m.contains(bVar2)) {
                this.f3208m.add(bVar2);
            }
        }
        this.f3207f.put(view.getId(), view);
        this.f3214u = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f3207f.remove(view.getId());
        this.f3209p.L0(i(view));
        this.f3208m.remove(view);
        this.f3214u = true;
    }

    public void q(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f3219z == null) {
                this.f3219z = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f3219z.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    protected void r(o2.f fVar, int i10, int i11, int i12, int i13) {
        e.b bVar;
        c cVar = this.H;
        int i14 = cVar.f3267e;
        int i15 = cVar.f3266d;
        e.b bVar2 = e.b.FIXED;
        int childCount = getChildCount();
        if (i10 != Integer.MIN_VALUE) {
            if (i10 != 0) {
                if (i10 != 1073741824) {
                    bVar = bVar2;
                    i11 = 0;
                } else {
                    i11 = Math.min(this.f3212s - i15, i11);
                    bVar = bVar2;
                }
            } else {
                bVar = e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i11 = Math.max(0, this.f3210q);
                }
                i11 = 0;
            }
        } else {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f3210q);
            }
        }
        if (i12 != Integer.MIN_VALUE) {
            if (i12 != 0) {
                if (i12 == 1073741824) {
                    i13 = Math.min(this.f3213t - i14, i13);
                }
                i13 = 0;
            } else {
                bVar2 = e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i13 = Math.max(0, this.f3211r);
                }
                i13 = 0;
            }
        } else {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f3211r);
            }
        }
        if (i11 != fVar.P() || i13 != fVar.v()) {
            fVar.Y0();
        }
        fVar.F0(0);
        fVar.G0(0);
        fVar.s0(this.f3212s - i15);
        fVar.r0(this.f3213t - i14);
        fVar.u0(0);
        fVar.t0(0);
        fVar.l0(bVar);
        fVar.E0(i11);
        fVar.A0(bVar2);
        fVar.h0(i13);
        fVar.u0(this.f3210q - i15);
        fVar.t0(this.f3211r - i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        l();
        super.requestLayout();
    }

    public void setConstraintSet(d dVar) {
        this.f3216w = dVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f3207f.remove(getId());
        super.setId(i10);
        this.f3207f.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f3213t) {
            return;
        }
        this.f3213t = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f3212s) {
            return;
        }
        this.f3212s = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f3211r) {
            return;
        }
        this.f3211r = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f3210q) {
            return;
        }
        this.f3210q = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
        androidx.constraintlayout.widget.c cVar = this.f3217x;
        if (cVar != null) {
            cVar.c(fVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f3215v = i10;
        this.f3209p.g1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3207f = new SparseArray<>();
        this.f3208m = new ArrayList<>(4);
        this.f3209p = new o2.f();
        this.f3210q = 0;
        this.f3211r = 0;
        this.f3212s = Integer.MAX_VALUE;
        this.f3213t = Integer.MAX_VALUE;
        this.f3214u = true;
        this.f3215v = 263;
        this.f3216w = null;
        this.f3217x = null;
        this.f3218y = -1;
        this.f3219z = new HashMap<>();
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = 0;
        this.F = 0;
        this.G = new SparseArray<>();
        this.H = new c(this);
        this.I = 0;
        this.J = 0;
        j(attributeSet, i10, 0);
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public float A;
        public String B;
        float C;
        int D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public float O;
        public float P;
        public int Q;
        public int R;
        public int S;
        public boolean T;
        public boolean U;
        public String V;
        boolean W;
        boolean X;
        boolean Y;
        boolean Z;

        /* renamed from: a  reason: collision with root package name */
        public int f3221a;

        /* renamed from: a0  reason: collision with root package name */
        boolean f3222a0;

        /* renamed from: b  reason: collision with root package name */
        public int f3223b;

        /* renamed from: b0  reason: collision with root package name */
        boolean f3224b0;

        /* renamed from: c  reason: collision with root package name */
        public float f3225c;

        /* renamed from: c0  reason: collision with root package name */
        boolean f3226c0;

        /* renamed from: d  reason: collision with root package name */
        public int f3227d;

        /* renamed from: d0  reason: collision with root package name */
        int f3228d0;

        /* renamed from: e  reason: collision with root package name */
        public int f3229e;

        /* renamed from: e0  reason: collision with root package name */
        int f3230e0;

        /* renamed from: f  reason: collision with root package name */
        public int f3231f;

        /* renamed from: f0  reason: collision with root package name */
        int f3232f0;

        /* renamed from: g  reason: collision with root package name */
        public int f3233g;

        /* renamed from: g0  reason: collision with root package name */
        int f3234g0;

        /* renamed from: h  reason: collision with root package name */
        public int f3235h;

        /* renamed from: h0  reason: collision with root package name */
        int f3236h0;

        /* renamed from: i  reason: collision with root package name */
        public int f3237i;

        /* renamed from: i0  reason: collision with root package name */
        int f3238i0;

        /* renamed from: j  reason: collision with root package name */
        public int f3239j;

        /* renamed from: j0  reason: collision with root package name */
        float f3240j0;

        /* renamed from: k  reason: collision with root package name */
        public int f3241k;

        /* renamed from: k0  reason: collision with root package name */
        int f3242k0;

        /* renamed from: l  reason: collision with root package name */
        public int f3243l;

        /* renamed from: l0  reason: collision with root package name */
        int f3244l0;

        /* renamed from: m  reason: collision with root package name */
        public int f3245m;

        /* renamed from: m0  reason: collision with root package name */
        float f3246m0;

        /* renamed from: n  reason: collision with root package name */
        public int f3247n;

        /* renamed from: n0  reason: collision with root package name */
        o2.e f3248n0;

        /* renamed from: o  reason: collision with root package name */
        public float f3249o;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f3250o0;

        /* renamed from: p  reason: collision with root package name */
        public int f3251p;

        /* renamed from: q  reason: collision with root package name */
        public int f3252q;

        /* renamed from: r  reason: collision with root package name */
        public int f3253r;

        /* renamed from: s  reason: collision with root package name */
        public int f3254s;

        /* renamed from: t  reason: collision with root package name */
        public int f3255t;

        /* renamed from: u  reason: collision with root package name */
        public int f3256u;

        /* renamed from: v  reason: collision with root package name */
        public int f3257v;

        /* renamed from: w  reason: collision with root package name */
        public int f3258w;

        /* renamed from: x  reason: collision with root package name */
        public int f3259x;

        /* renamed from: y  reason: collision with root package name */
        public int f3260y;

        /* renamed from: z  reason: collision with root package name */
        public float f3261z;

        /* loaded from: classes.dex */
        private static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f3262a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f3262a = sparseIntArray;
                sparseIntArray.append(j.f3472l2, 8);
                sparseIntArray.append(j.f3479m2, 9);
                sparseIntArray.append(j.f3493o2, 10);
                sparseIntArray.append(j.f3500p2, 11);
                sparseIntArray.append(j.f3542v2, 12);
                sparseIntArray.append(j.f3535u2, 13);
                sparseIntArray.append(j.T1, 14);
                sparseIntArray.append(j.S1, 15);
                sparseIntArray.append(j.Q1, 16);
                sparseIntArray.append(j.U1, 2);
                sparseIntArray.append(j.W1, 3);
                sparseIntArray.append(j.V1, 4);
                sparseIntArray.append(j.D2, 49);
                sparseIntArray.append(j.E2, 50);
                sparseIntArray.append(j.f3395a2, 5);
                sparseIntArray.append(j.f3402b2, 6);
                sparseIntArray.append(j.f3409c2, 7);
                sparseIntArray.append(j.f3401b1, 1);
                sparseIntArray.append(j.f3507q2, 17);
                sparseIntArray.append(j.f3514r2, 18);
                sparseIntArray.append(j.Z1, 19);
                sparseIntArray.append(j.Y1, 20);
                sparseIntArray.append(j.H2, 21);
                sparseIntArray.append(j.K2, 22);
                sparseIntArray.append(j.I2, 23);
                sparseIntArray.append(j.F2, 24);
                sparseIntArray.append(j.J2, 25);
                sparseIntArray.append(j.G2, 26);
                sparseIntArray.append(j.f3444h2, 29);
                sparseIntArray.append(j.f3549w2, 30);
                sparseIntArray.append(j.X1, 44);
                sparseIntArray.append(j.f3458j2, 45);
                sparseIntArray.append(j.f3563y2, 46);
                sparseIntArray.append(j.f3451i2, 47);
                sparseIntArray.append(j.f3556x2, 48);
                sparseIntArray.append(j.O1, 27);
                sparseIntArray.append(j.N1, 28);
                sparseIntArray.append(j.f3570z2, 31);
                sparseIntArray.append(j.f3416d2, 32);
                sparseIntArray.append(j.B2, 33);
                sparseIntArray.append(j.A2, 34);
                sparseIntArray.append(j.C2, 35);
                sparseIntArray.append(j.f3430f2, 36);
                sparseIntArray.append(j.f3423e2, 37);
                sparseIntArray.append(j.f3437g2, 38);
                sparseIntArray.append(j.f3465k2, 39);
                sparseIntArray.append(j.f3528t2, 40);
                sparseIntArray.append(j.f3486n2, 41);
                sparseIntArray.append(j.R1, 42);
                sparseIntArray.append(j.P1, 43);
                sparseIntArray.append(j.f3521s2, 51);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i10;
            this.f3221a = -1;
            this.f3223b = -1;
            this.f3225c = -1.0f;
            this.f3227d = -1;
            this.f3229e = -1;
            this.f3231f = -1;
            this.f3233g = -1;
            this.f3235h = -1;
            this.f3237i = -1;
            this.f3239j = -1;
            this.f3241k = -1;
            this.f3243l = -1;
            this.f3245m = -1;
            this.f3247n = 0;
            this.f3249o = 0.0f;
            this.f3251p = -1;
            this.f3252q = -1;
            this.f3253r = -1;
            this.f3254s = -1;
            this.f3255t = -1;
            this.f3256u = -1;
            this.f3257v = -1;
            this.f3258w = -1;
            this.f3259x = -1;
            this.f3260y = -1;
            this.f3261z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.f3222a0 = false;
            this.f3224b0 = false;
            this.f3226c0 = false;
            this.f3228d0 = -1;
            this.f3230e0 = -1;
            this.f3232f0 = -1;
            this.f3234g0 = -1;
            this.f3236h0 = -1;
            this.f3238i0 = -1;
            this.f3240j0 = 0.5f;
            this.f3248n0 = new o2.e();
            this.f3250o0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f3394a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                int i12 = a.f3262a.get(index);
                switch (i12) {
                    case 1:
                        this.S = obtainStyledAttributes.getInt(index, this.S);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f3245m);
                        this.f3245m = resourceId;
                        if (resourceId == -1) {
                            this.f3245m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f3247n = obtainStyledAttributes.getDimensionPixelSize(index, this.f3247n);
                        break;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f3249o) % 360.0f;
                        this.f3249o = f10;
                        if (f10 < 0.0f) {
                            this.f3249o = (360.0f - f10) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f3221a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3221a);
                        break;
                    case 6:
                        this.f3223b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3223b);
                        break;
                    case 7:
                        this.f3225c = obtainStyledAttributes.getFloat(index, this.f3225c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f3227d);
                        this.f3227d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f3227d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f3229e);
                        this.f3229e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f3229e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f3231f);
                        this.f3231f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f3231f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f3233g);
                        this.f3233g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f3233g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f3235h);
                        this.f3235h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f3235h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f3237i);
                        this.f3237i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f3237i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f3239j);
                        this.f3239j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f3239j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f3241k);
                        this.f3241k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f3241k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f3243l);
                        this.f3243l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f3243l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f3251p);
                        this.f3251p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f3251p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f3252q);
                        this.f3252q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f3252q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f3253r);
                        this.f3253r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f3253r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f3254s);
                        this.f3254s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f3254s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f3255t = obtainStyledAttributes.getDimensionPixelSize(index, this.f3255t);
                        break;
                    case 22:
                        this.f3256u = obtainStyledAttributes.getDimensionPixelSize(index, this.f3256u);
                        break;
                    case 23:
                        this.f3257v = obtainStyledAttributes.getDimensionPixelSize(index, this.f3257v);
                        break;
                    case 24:
                        this.f3258w = obtainStyledAttributes.getDimensionPixelSize(index, this.f3258w);
                        break;
                    case 25:
                        this.f3259x = obtainStyledAttributes.getDimensionPixelSize(index, this.f3259x);
                        break;
                    case 26:
                        this.f3260y = obtainStyledAttributes.getDimensionPixelSize(index, this.f3260y);
                        break;
                    case 27:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        break;
                    case 28:
                        this.U = obtainStyledAttributes.getBoolean(index, this.U);
                        break;
                    case 29:
                        this.f3261z = obtainStyledAttributes.getFloat(index, this.f3261z);
                        break;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        break;
                    case 31:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.I = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i14 = obtainStyledAttributes.getInt(index, 0);
                        this.J = i14;
                        if (i14 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        break;
                    case 36:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.P));
                        this.J = 2;
                        break;
                    default:
                        switch (i12) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = Float.NaN;
                                this.D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i10 = 0;
                                    } else {
                                        String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.D = 1;
                                        }
                                        i10 = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.B.substring(i10, indexOf2);
                                        String substring3 = this.B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.D == 1) {
                                                        this.C = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        this.C = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.B.substring(i10);
                                        if (substring4.length() > 0) {
                                            this.C = Float.parseFloat(substring4);
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            case 45:
                                this.E = obtainStyledAttributes.getFloat(index, this.E);
                                continue;
                            case 46:
                                this.F = obtainStyledAttributes.getFloat(index, this.F);
                                continue;
                            case 47:
                                this.G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.H = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                continue;
                            case 50:
                                this.R = obtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                                continue;
                            case 51:
                                this.V = obtainStyledAttributes.getString(index);
                                continue;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.Z = false;
            this.W = true;
            this.X = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.U) {
                this.X = false;
                if (this.J == 0) {
                    this.J = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.W = false;
                if (i10 == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.T = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.X = false;
                if (i11 == 0 && this.J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.U = true;
                }
            }
            if (this.f3225c != -1.0f || this.f3221a != -1 || this.f3223b != -1) {
                this.Z = true;
                this.W = true;
                this.X = true;
                if (!(this.f3248n0 instanceof o2.h)) {
                    this.f3248n0 = new o2.h();
                }
                ((o2.h) this.f3248n0).R0(this.S);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f3221a = -1;
            this.f3223b = -1;
            this.f3225c = -1.0f;
            this.f3227d = -1;
            this.f3229e = -1;
            this.f3231f = -1;
            this.f3233g = -1;
            this.f3235h = -1;
            this.f3237i = -1;
            this.f3239j = -1;
            this.f3241k = -1;
            this.f3243l = -1;
            this.f3245m = -1;
            this.f3247n = 0;
            this.f3249o = 0.0f;
            this.f3251p = -1;
            this.f3252q = -1;
            this.f3253r = -1;
            this.f3254s = -1;
            this.f3255t = -1;
            this.f3256u = -1;
            this.f3257v = -1;
            this.f3258w = -1;
            this.f3259x = -1;
            this.f3260y = -1;
            this.f3261z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.f3222a0 = false;
            this.f3224b0 = false;
            this.f3226c0 = false;
            this.f3228d0 = -1;
            this.f3230e0 = -1;
            this.f3232f0 = -1;
            this.f3234g0 = -1;
            this.f3236h0 = -1;
            this.f3238i0 = -1;
            this.f3240j0 = 0.5f;
            this.f3248n0 = new o2.e();
            this.f3250o0 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3221a = -1;
            this.f3223b = -1;
            this.f3225c = -1.0f;
            this.f3227d = -1;
            this.f3229e = -1;
            this.f3231f = -1;
            this.f3233g = -1;
            this.f3235h = -1;
            this.f3237i = -1;
            this.f3239j = -1;
            this.f3241k = -1;
            this.f3243l = -1;
            this.f3245m = -1;
            this.f3247n = 0;
            this.f3249o = 0.0f;
            this.f3251p = -1;
            this.f3252q = -1;
            this.f3253r = -1;
            this.f3254s = -1;
            this.f3255t = -1;
            this.f3256u = -1;
            this.f3257v = -1;
            this.f3258w = -1;
            this.f3259x = -1;
            this.f3260y = -1;
            this.f3261z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.f3222a0 = false;
            this.f3224b0 = false;
            this.f3226c0 = false;
            this.f3228d0 = -1;
            this.f3230e0 = -1;
            this.f3232f0 = -1;
            this.f3234g0 = -1;
            this.f3236h0 = -1;
            this.f3238i0 = -1;
            this.f3240j0 = 0.5f;
            this.f3248n0 = new o2.e();
            this.f3250o0 = false;
        }
    }
}
