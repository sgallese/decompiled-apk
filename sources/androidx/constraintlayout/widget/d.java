package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f3302d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    private static SparseIntArray f3303e;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.widget.a> f3304a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f3305b = true;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<Integer, a> f3306c = new HashMap<>();

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f3307a;

        /* renamed from: b  reason: collision with root package name */
        public final C0062d f3308b = new C0062d();

        /* renamed from: c  reason: collision with root package name */
        public final c f3309c = new c();

        /* renamed from: d  reason: collision with root package name */
        public final b f3310d = new b();

        /* renamed from: e  reason: collision with root package name */
        public final e f3311e = new e();

        /* renamed from: f  reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f3312f = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        public void f(int i10, ConstraintLayout.b bVar) {
            this.f3307a = i10;
            b bVar2 = this.f3310d;
            bVar2.f3328h = bVar.f3227d;
            bVar2.f3330i = bVar.f3229e;
            bVar2.f3332j = bVar.f3231f;
            bVar2.f3334k = bVar.f3233g;
            bVar2.f3335l = bVar.f3235h;
            bVar2.f3336m = bVar.f3237i;
            bVar2.f3337n = bVar.f3239j;
            bVar2.f3338o = bVar.f3241k;
            bVar2.f3339p = bVar.f3243l;
            bVar2.f3340q = bVar.f3251p;
            bVar2.f3341r = bVar.f3252q;
            bVar2.f3342s = bVar.f3253r;
            bVar2.f3343t = bVar.f3254s;
            bVar2.f3344u = bVar.f3261z;
            bVar2.f3345v = bVar.A;
            bVar2.f3346w = bVar.B;
            bVar2.f3347x = bVar.f3245m;
            bVar2.f3348y = bVar.f3247n;
            bVar2.f3349z = bVar.f3249o;
            bVar2.A = bVar.Q;
            bVar2.B = bVar.R;
            bVar2.C = bVar.S;
            bVar2.f3326g = bVar.f3225c;
            bVar2.f3322e = bVar.f3221a;
            bVar2.f3324f = bVar.f3223b;
            bVar2.f3318c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f3320d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.D = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.E = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.F = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.G = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.P = bVar.F;
            bVar2.Q = bVar.E;
            bVar2.S = bVar.H;
            bVar2.R = bVar.G;
            bVar2.f3329h0 = bVar.T;
            bVar2.f3331i0 = bVar.U;
            bVar2.T = bVar.I;
            bVar2.U = bVar.J;
            bVar2.V = bVar.M;
            bVar2.W = bVar.N;
            bVar2.X = bVar.K;
            bVar2.Y = bVar.L;
            bVar2.Z = bVar.O;
            bVar2.f3315a0 = bVar.P;
            bVar2.f3327g0 = bVar.V;
            bVar2.K = bVar.f3256u;
            bVar2.M = bVar.f3258w;
            bVar2.J = bVar.f3255t;
            bVar2.L = bVar.f3257v;
            bVar2.O = bVar.f3259x;
            bVar2.N = bVar.f3260y;
            bVar2.H = bVar.getMarginEnd();
            this.f3310d.I = bVar.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i10, e.a aVar) {
            f(i10, aVar);
            this.f3308b.f3361d = aVar.f3378p0;
            e eVar = this.f3311e;
            eVar.f3365b = aVar.f3381s0;
            eVar.f3366c = aVar.f3382t0;
            eVar.f3367d = aVar.f3383u0;
            eVar.f3368e = aVar.f3384v0;
            eVar.f3369f = aVar.f3385w0;
            eVar.f3370g = aVar.f3386x0;
            eVar.f3371h = aVar.f3387y0;
            eVar.f3372i = aVar.f3388z0;
            eVar.f3373j = aVar.A0;
            eVar.f3374k = aVar.B0;
            eVar.f3376m = aVar.f3380r0;
            eVar.f3375l = aVar.f3379q0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(androidx.constraintlayout.widget.b bVar, int i10, e.a aVar) {
            g(i10, aVar);
            if (bVar instanceof Barrier) {
                b bVar2 = this.f3310d;
                bVar2.f3321d0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.f3317b0 = barrier.getType();
                this.f3310d.f3323e0 = barrier.getReferencedIds();
                this.f3310d.f3319c0 = barrier.getMargin();
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f3310d;
            bVar.f3227d = bVar2.f3328h;
            bVar.f3229e = bVar2.f3330i;
            bVar.f3231f = bVar2.f3332j;
            bVar.f3233g = bVar2.f3334k;
            bVar.f3235h = bVar2.f3335l;
            bVar.f3237i = bVar2.f3336m;
            bVar.f3239j = bVar2.f3337n;
            bVar.f3241k = bVar2.f3338o;
            bVar.f3243l = bVar2.f3339p;
            bVar.f3251p = bVar2.f3340q;
            bVar.f3252q = bVar2.f3341r;
            bVar.f3253r = bVar2.f3342s;
            bVar.f3254s = bVar2.f3343t;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.D;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.E;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.F;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.G;
            bVar.f3259x = bVar2.O;
            bVar.f3260y = bVar2.N;
            bVar.f3256u = bVar2.K;
            bVar.f3258w = bVar2.M;
            bVar.f3261z = bVar2.f3344u;
            bVar.A = bVar2.f3345v;
            bVar.f3245m = bVar2.f3347x;
            bVar.f3247n = bVar2.f3348y;
            bVar.f3249o = bVar2.f3349z;
            bVar.B = bVar2.f3346w;
            bVar.Q = bVar2.A;
            bVar.R = bVar2.B;
            bVar.F = bVar2.P;
            bVar.E = bVar2.Q;
            bVar.H = bVar2.S;
            bVar.G = bVar2.R;
            bVar.T = bVar2.f3329h0;
            bVar.U = bVar2.f3331i0;
            bVar.I = bVar2.T;
            bVar.J = bVar2.U;
            bVar.M = bVar2.V;
            bVar.N = bVar2.W;
            bVar.K = bVar2.X;
            bVar.L = bVar2.Y;
            bVar.O = bVar2.Z;
            bVar.P = bVar2.f3315a0;
            bVar.S = bVar2.C;
            bVar.f3225c = bVar2.f3326g;
            bVar.f3221a = bVar2.f3322e;
            bVar.f3223b = bVar2.f3324f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f3318c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f3320d;
            String str = bVar2.f3327g0;
            if (str != null) {
                bVar.V = str;
            }
            bVar.setMarginStart(bVar2.I);
            bVar.setMarginEnd(this.f3310d.H);
            bVar.a();
        }

        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f3310d.a(this.f3310d);
            aVar.f3309c.a(this.f3309c);
            aVar.f3308b.a(this.f3308b);
            aVar.f3311e.a(this.f3311e);
            aVar.f3307a = this.f3307a;
            return aVar;
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: k0  reason: collision with root package name */
        private static SparseIntArray f3313k0;

        /* renamed from: c  reason: collision with root package name */
        public int f3318c;

        /* renamed from: d  reason: collision with root package name */
        public int f3320d;

        /* renamed from: e0  reason: collision with root package name */
        public int[] f3323e0;

        /* renamed from: f0  reason: collision with root package name */
        public String f3325f0;

        /* renamed from: g0  reason: collision with root package name */
        public String f3327g0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f3314a = false;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3316b = false;

        /* renamed from: e  reason: collision with root package name */
        public int f3322e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f3324f = -1;

        /* renamed from: g  reason: collision with root package name */
        public float f3326g = -1.0f;

        /* renamed from: h  reason: collision with root package name */
        public int f3328h = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f3330i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f3332j = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f3334k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f3335l = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f3336m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f3337n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f3338o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f3339p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f3340q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f3341r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f3342s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f3343t = -1;

        /* renamed from: u  reason: collision with root package name */
        public float f3344u = 0.5f;

        /* renamed from: v  reason: collision with root package name */
        public float f3345v = 0.5f;

        /* renamed from: w  reason: collision with root package name */
        public String f3346w = null;

        /* renamed from: x  reason: collision with root package name */
        public int f3347x = -1;

        /* renamed from: y  reason: collision with root package name */
        public int f3348y = 0;

        /* renamed from: z  reason: collision with root package name */
        public float f3349z = 0.0f;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public float P = -1.0f;
        public float Q = -1.0f;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = -1;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public float Z = 1.0f;

        /* renamed from: a0  reason: collision with root package name */
        public float f3315a0 = 1.0f;

        /* renamed from: b0  reason: collision with root package name */
        public int f3317b0 = -1;

        /* renamed from: c0  reason: collision with root package name */
        public int f3319c0 = 0;

        /* renamed from: d0  reason: collision with root package name */
        public int f3321d0 = -1;

        /* renamed from: h0  reason: collision with root package name */
        public boolean f3329h0 = false;

        /* renamed from: i0  reason: collision with root package name */
        public boolean f3331i0 = false;

        /* renamed from: j0  reason: collision with root package name */
        public boolean f3333j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3313k0 = sparseIntArray;
            sparseIntArray.append(j.f3418d4, 24);
            f3313k0.append(j.f3425e4, 25);
            f3313k0.append(j.f3439g4, 28);
            f3313k0.append(j.f3446h4, 29);
            f3313k0.append(j.f3481m4, 35);
            f3313k0.append(j.f3474l4, 34);
            f3313k0.append(j.O3, 4);
            f3313k0.append(j.N3, 3);
            f3313k0.append(j.L3, 1);
            f3313k0.append(j.f3516r4, 6);
            f3313k0.append(j.f3523s4, 7);
            f3313k0.append(j.V3, 17);
            f3313k0.append(j.W3, 18);
            f3313k0.append(j.X3, 19);
            f3313k0.append(j.f3550w3, 26);
            f3313k0.append(j.f3453i4, 31);
            f3313k0.append(j.f3460j4, 32);
            f3313k0.append(j.U3, 10);
            f3313k0.append(j.T3, 9);
            f3313k0.append(j.f3544v4, 13);
            f3313k0.append(j.f3565y4, 16);
            f3313k0.append(j.f3551w4, 14);
            f3313k0.append(j.f3530t4, 11);
            f3313k0.append(j.f3558x4, 15);
            f3313k0.append(j.f3537u4, 12);
            f3313k0.append(j.f3502p4, 38);
            f3313k0.append(j.f3404b4, 37);
            f3313k0.append(j.f3397a4, 39);
            f3313k0.append(j.f3495o4, 40);
            f3313k0.append(j.Z3, 20);
            f3313k0.append(j.f3488n4, 36);
            f3313k0.append(j.S3, 5);
            f3313k0.append(j.f3411c4, 76);
            f3313k0.append(j.f3467k4, 76);
            f3313k0.append(j.f3432f4, 76);
            f3313k0.append(j.M3, 76);
            f3313k0.append(j.K3, 76);
            f3313k0.append(j.f3571z3, 23);
            f3313k0.append(j.B3, 27);
            f3313k0.append(j.D3, 30);
            f3313k0.append(j.E3, 8);
            f3313k0.append(j.A3, 33);
            f3313k0.append(j.C3, 2);
            f3313k0.append(j.f3557x3, 22);
            f3313k0.append(j.f3564y3, 21);
            f3313k0.append(j.P3, 61);
            f3313k0.append(j.R3, 62);
            f3313k0.append(j.Q3, 63);
            f3313k0.append(j.f3509q4, 69);
            f3313k0.append(j.Y3, 70);
            f3313k0.append(j.I3, 71);
            f3313k0.append(j.G3, 72);
            f3313k0.append(j.H3, 73);
            f3313k0.append(j.J3, 74);
            f3313k0.append(j.F3, 75);
        }

        public void a(b bVar) {
            this.f3314a = bVar.f3314a;
            this.f3318c = bVar.f3318c;
            this.f3316b = bVar.f3316b;
            this.f3320d = bVar.f3320d;
            this.f3322e = bVar.f3322e;
            this.f3324f = bVar.f3324f;
            this.f3326g = bVar.f3326g;
            this.f3328h = bVar.f3328h;
            this.f3330i = bVar.f3330i;
            this.f3332j = bVar.f3332j;
            this.f3334k = bVar.f3334k;
            this.f3335l = bVar.f3335l;
            this.f3336m = bVar.f3336m;
            this.f3337n = bVar.f3337n;
            this.f3338o = bVar.f3338o;
            this.f3339p = bVar.f3339p;
            this.f3340q = bVar.f3340q;
            this.f3341r = bVar.f3341r;
            this.f3342s = bVar.f3342s;
            this.f3343t = bVar.f3343t;
            this.f3344u = bVar.f3344u;
            this.f3345v = bVar.f3345v;
            this.f3346w = bVar.f3346w;
            this.f3347x = bVar.f3347x;
            this.f3348y = bVar.f3348y;
            this.f3349z = bVar.f3349z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f3315a0 = bVar.f3315a0;
            this.f3317b0 = bVar.f3317b0;
            this.f3319c0 = bVar.f3319c0;
            this.f3321d0 = bVar.f3321d0;
            this.f3327g0 = bVar.f3327g0;
            int[] iArr = bVar.f3323e0;
            if (iArr != null) {
                this.f3323e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f3323e0 = null;
            }
            this.f3325f0 = bVar.f3325f0;
            this.f3329h0 = bVar.f3329h0;
            this.f3331i0 = bVar.f3331i0;
            this.f3333j0 = bVar.f3333j0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f3543v3);
            this.f3316b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f3313k0.get(index);
                if (i11 != 80) {
                    if (i11 != 81) {
                        switch (i11) {
                            case 1:
                                this.f3339p = d.n(obtainStyledAttributes, index, this.f3339p);
                                continue;
                            case 2:
                                this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                                continue;
                            case 3:
                                this.f3338o = d.n(obtainStyledAttributes, index, this.f3338o);
                                continue;
                            case 4:
                                this.f3337n = d.n(obtainStyledAttributes, index, this.f3337n);
                                continue;
                            case 5:
                                this.f3346w = obtainStyledAttributes.getString(index);
                                continue;
                            case 6:
                                this.A = obtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                                continue;
                            case 7:
                                this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                                continue;
                            case 8:
                                this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                                continue;
                            case 9:
                                this.f3343t = d.n(obtainStyledAttributes, index, this.f3343t);
                                continue;
                            case 10:
                                this.f3342s = d.n(obtainStyledAttributes, index, this.f3342s);
                                continue;
                            case 11:
                                this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                continue;
                            case 12:
                                this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                continue;
                            case 13:
                                this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                                continue;
                            case 14:
                                this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                continue;
                            case 15:
                                this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                                continue;
                            case 16:
                                this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                                continue;
                            case 17:
                                this.f3322e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3322e);
                                continue;
                            case 18:
                                this.f3324f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3324f);
                                continue;
                            case 19:
                                this.f3326g = obtainStyledAttributes.getFloat(index, this.f3326g);
                                continue;
                            case 20:
                                this.f3344u = obtainStyledAttributes.getFloat(index, this.f3344u);
                                continue;
                            case 21:
                                this.f3320d = obtainStyledAttributes.getLayoutDimension(index, this.f3320d);
                                continue;
                            case 22:
                                this.f3318c = obtainStyledAttributes.getLayoutDimension(index, this.f3318c);
                                continue;
                            case 23:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                continue;
                            case 24:
                                this.f3328h = d.n(obtainStyledAttributes, index, this.f3328h);
                                continue;
                            case 25:
                                this.f3330i = d.n(obtainStyledAttributes, index, this.f3330i);
                                continue;
                            case 26:
                                this.C = obtainStyledAttributes.getInt(index, this.C);
                                continue;
                            case 27:
                                this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                                continue;
                            case 28:
                                this.f3332j = d.n(obtainStyledAttributes, index, this.f3332j);
                                continue;
                            case 29:
                                this.f3334k = d.n(obtainStyledAttributes, index, this.f3334k);
                                continue;
                            case 30:
                                this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                                continue;
                            case 31:
                                this.f3340q = d.n(obtainStyledAttributes, index, this.f3340q);
                                continue;
                            case 32:
                                this.f3341r = d.n(obtainStyledAttributes, index, this.f3341r);
                                continue;
                            case 33:
                                this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                                continue;
                            case 34:
                                this.f3336m = d.n(obtainStyledAttributes, index, this.f3336m);
                                continue;
                            case 35:
                                this.f3335l = d.n(obtainStyledAttributes, index, this.f3335l);
                                continue;
                            case 36:
                                this.f3345v = obtainStyledAttributes.getFloat(index, this.f3345v);
                                continue;
                            case 37:
                                this.Q = obtainStyledAttributes.getFloat(index, this.Q);
                                continue;
                            case 38:
                                this.P = obtainStyledAttributes.getFloat(index, this.P);
                                continue;
                            case 39:
                                this.R = obtainStyledAttributes.getInt(index, this.R);
                                continue;
                            case 40:
                                this.S = obtainStyledAttributes.getInt(index, this.S);
                                continue;
                            default:
                                switch (i11) {
                                    case 54:
                                        this.T = obtainStyledAttributes.getInt(index, this.T);
                                        continue;
                                    case 55:
                                        this.U = obtainStyledAttributes.getInt(index, this.U);
                                        continue;
                                    case 56:
                                        this.V = obtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                        continue;
                                    case 57:
                                        this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                        continue;
                                    case 58:
                                        this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                        continue;
                                    case 59:
                                        this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                        continue;
                                    default:
                                        switch (i11) {
                                            case 61:
                                                this.f3347x = d.n(obtainStyledAttributes, index, this.f3347x);
                                                continue;
                                            case 62:
                                                this.f3348y = obtainStyledAttributes.getDimensionPixelSize(index, this.f3348y);
                                                continue;
                                            case 63:
                                                this.f3349z = obtainStyledAttributes.getFloat(index, this.f3349z);
                                                continue;
                                            default:
                                                switch (i11) {
                                                    case 69:
                                                        this.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                        continue;
                                                    case 70:
                                                        this.f3315a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                        continue;
                                                    case 71:
                                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                        continue;
                                                    case 72:
                                                        this.f3317b0 = obtainStyledAttributes.getInt(index, this.f3317b0);
                                                        continue;
                                                    case 73:
                                                        this.f3319c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3319c0);
                                                        continue;
                                                    case 74:
                                                        this.f3325f0 = obtainStyledAttributes.getString(index);
                                                        continue;
                                                    case 75:
                                                        this.f3333j0 = obtainStyledAttributes.getBoolean(index, this.f3333j0);
                                                        continue;
                                                    case 76:
                                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f3313k0.get(index));
                                                        continue;
                                                    case 77:
                                                        this.f3327g0 = obtainStyledAttributes.getString(index);
                                                        continue;
                                                    default:
                                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f3313k0.get(index));
                                                        continue;
                                                        continue;
                                                        continue;
                                                        continue;
                                                }
                                        }
                                }
                        }
                    } else {
                        this.f3331i0 = obtainStyledAttributes.getBoolean(index, this.f3331i0);
                    }
                } else {
                    this.f3329h0 = obtainStyledAttributes.getBoolean(index, this.f3329h0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: h  reason: collision with root package name */
        private static SparseIntArray f3350h;

        /* renamed from: a  reason: collision with root package name */
        public boolean f3351a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f3352b = -1;

        /* renamed from: c  reason: collision with root package name */
        public String f3353c = null;

        /* renamed from: d  reason: collision with root package name */
        public int f3354d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f3355e = 0;

        /* renamed from: f  reason: collision with root package name */
        public float f3356f = Float.NaN;

        /* renamed from: g  reason: collision with root package name */
        public float f3357g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3350h = sparseIntArray;
            sparseIntArray.append(j.J4, 1);
            f3350h.append(j.L4, 2);
            f3350h.append(j.M4, 3);
            f3350h.append(j.I4, 4);
            f3350h.append(j.H4, 5);
            f3350h.append(j.K4, 6);
        }

        public void a(c cVar) {
            this.f3351a = cVar.f3351a;
            this.f3352b = cVar.f3352b;
            this.f3353c = cVar.f3353c;
            this.f3354d = cVar.f3354d;
            this.f3355e = cVar.f3355e;
            this.f3357g = cVar.f3357g;
            this.f3356f = cVar.f3356f;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.G4);
            this.f3351a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f3350h.get(index)) {
                    case 1:
                        this.f3357g = obtainStyledAttributes.getFloat(index, this.f3357g);
                        break;
                    case 2:
                        this.f3354d = obtainStyledAttributes.getInt(index, this.f3354d);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f3353c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f3353c = l2.a.f19497c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f3355e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f3352b = d.n(obtainStyledAttributes, index, this.f3352b);
                        break;
                    case 6:
                        this.f3356f = obtainStyledAttributes.getFloat(index, this.f3356f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0062d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3358a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f3359b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f3360c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f3361d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f3362e = Float.NaN;

        public void a(C0062d c0062d) {
            this.f3358a = c0062d.f3358a;
            this.f3359b = c0062d.f3359b;
            this.f3361d = c0062d.f3361d;
            this.f3362e = c0062d.f3362e;
            this.f3360c = c0062d.f3360c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.V4);
            this.f3358a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == j.X4) {
                    this.f3361d = obtainStyledAttributes.getFloat(index, this.f3361d);
                } else if (index == j.W4) {
                    this.f3359b = obtainStyledAttributes.getInt(index, this.f3359b);
                    this.f3359b = d.f3302d[this.f3359b];
                } else if (index == j.Z4) {
                    this.f3360c = obtainStyledAttributes.getInt(index, this.f3360c);
                } else if (index == j.Y4) {
                    this.f3362e = obtainStyledAttributes.getFloat(index, this.f3362e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: n  reason: collision with root package name */
        private static SparseIntArray f3363n;

        /* renamed from: a  reason: collision with root package name */
        public boolean f3364a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f3365b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f3366c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f3367d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f3368e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f3369f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f3370g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f3371h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public float f3372i = 0.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f3373j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f3374k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public boolean f3375l = false;

        /* renamed from: m  reason: collision with root package name */
        public float f3376m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3363n = sparseIntArray;
            sparseIntArray.append(j.f3531t5, 1);
            f3363n.append(j.f3538u5, 2);
            f3363n.append(j.f3545v5, 3);
            f3363n.append(j.f3517r5, 4);
            f3363n.append(j.f3524s5, 5);
            f3363n.append(j.f3489n5, 6);
            f3363n.append(j.f3496o5, 7);
            f3363n.append(j.f3503p5, 8);
            f3363n.append(j.f3510q5, 9);
            f3363n.append(j.f3552w5, 10);
            f3363n.append(j.f3559x5, 11);
        }

        public void a(e eVar) {
            this.f3364a = eVar.f3364a;
            this.f3365b = eVar.f3365b;
            this.f3366c = eVar.f3366c;
            this.f3367d = eVar.f3367d;
            this.f3368e = eVar.f3368e;
            this.f3369f = eVar.f3369f;
            this.f3370g = eVar.f3370g;
            this.f3371h = eVar.f3371h;
            this.f3372i = eVar.f3372i;
            this.f3373j = eVar.f3373j;
            this.f3374k = eVar.f3374k;
            this.f3375l = eVar.f3375l;
            this.f3376m = eVar.f3376m;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f3482m5);
            this.f3364a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f3363n.get(index)) {
                    case 1:
                        this.f3365b = obtainStyledAttributes.getFloat(index, this.f3365b);
                        break;
                    case 2:
                        this.f3366c = obtainStyledAttributes.getFloat(index, this.f3366c);
                        break;
                    case 3:
                        this.f3367d = obtainStyledAttributes.getFloat(index, this.f3367d);
                        break;
                    case 4:
                        this.f3368e = obtainStyledAttributes.getFloat(index, this.f3368e);
                        break;
                    case 5:
                        this.f3369f = obtainStyledAttributes.getFloat(index, this.f3369f);
                        break;
                    case 6:
                        this.f3370g = obtainStyledAttributes.getDimension(index, this.f3370g);
                        break;
                    case 7:
                        this.f3371h = obtainStyledAttributes.getDimension(index, this.f3371h);
                        break;
                    case 8:
                        this.f3372i = obtainStyledAttributes.getDimension(index, this.f3372i);
                        break;
                    case 9:
                        this.f3373j = obtainStyledAttributes.getDimension(index, this.f3373j);
                        break;
                    case 10:
                        this.f3374k = obtainStyledAttributes.getDimension(index, this.f3374k);
                        break;
                    case 11:
                        this.f3375l = true;
                        this.f3376m = obtainStyledAttributes.getDimension(index, this.f3376m);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3303e = sparseIntArray;
        sparseIntArray.append(j.f3533u0, 25);
        f3303e.append(j.f3540v0, 26);
        f3303e.append(j.f3554x0, 29);
        f3303e.append(j.f3561y0, 30);
        f3303e.append(j.E0, 36);
        f3303e.append(j.D0, 35);
        f3303e.append(j.f3407c0, 4);
        f3303e.append(j.f3400b0, 3);
        f3303e.append(j.Z, 1);
        f3303e.append(j.M0, 6);
        f3303e.append(j.N0, 7);
        f3303e.append(j.f3456j0, 17);
        f3303e.append(j.f3463k0, 18);
        f3303e.append(j.f3470l0, 19);
        f3303e.append(j.f3518s, 27);
        f3303e.append(j.f3568z0, 32);
        f3303e.append(j.A0, 33);
        f3303e.append(j.f3449i0, 10);
        f3303e.append(j.f3442h0, 9);
        f3303e.append(j.Q0, 13);
        f3303e.append(j.T0, 16);
        f3303e.append(j.R0, 14);
        f3303e.append(j.O0, 11);
        f3303e.append(j.S0, 15);
        f3303e.append(j.P0, 12);
        f3303e.append(j.H0, 40);
        f3303e.append(j.f3519s0, 39);
        f3303e.append(j.f3512r0, 41);
        f3303e.append(j.G0, 42);
        f3303e.append(j.f3505q0, 20);
        f3303e.append(j.F0, 37);
        f3303e.append(j.f3435g0, 5);
        f3303e.append(j.f3526t0, 82);
        f3303e.append(j.C0, 82);
        f3303e.append(j.f3547w0, 82);
        f3303e.append(j.f3393a0, 82);
        f3303e.append(j.Y, 82);
        f3303e.append(j.f3553x, 24);
        f3303e.append(j.f3567z, 28);
        f3303e.append(j.L, 31);
        f3303e.append(j.M, 8);
        f3303e.append(j.f3560y, 34);
        f3303e.append(j.A, 2);
        f3303e.append(j.f3539v, 23);
        f3303e.append(j.f3546w, 21);
        f3303e.append(j.f3532u, 22);
        f3303e.append(j.B, 43);
        f3303e.append(j.O, 44);
        f3303e.append(j.J, 45);
        f3303e.append(j.K, 46);
        f3303e.append(j.I, 60);
        f3303e.append(j.G, 47);
        f3303e.append(j.H, 48);
        f3303e.append(j.C, 49);
        f3303e.append(j.D, 50);
        f3303e.append(j.E, 51);
        f3303e.append(j.F, 52);
        f3303e.append(j.N, 53);
        f3303e.append(j.I0, 54);
        f3303e.append(j.f3477m0, 55);
        f3303e.append(j.J0, 56);
        f3303e.append(j.f3484n0, 57);
        f3303e.append(j.K0, 58);
        f3303e.append(j.f3491o0, 59);
        f3303e.append(j.f3414d0, 61);
        f3303e.append(j.f3428f0, 62);
        f3303e.append(j.f3421e0, 63);
        f3303e.append(j.P, 64);
        f3303e.append(j.X0, 65);
        f3303e.append(j.V, 66);
        f3303e.append(j.Y0, 67);
        f3303e.append(j.V0, 79);
        f3303e.append(j.f3525t, 38);
        f3303e.append(j.U0, 68);
        f3303e.append(j.L0, 69);
        f3303e.append(j.f3498p0, 70);
        f3303e.append(j.T, 71);
        f3303e.append(j.R, 72);
        f3303e.append(j.S, 73);
        f3303e.append(j.U, 74);
        f3303e.append(j.Q, 75);
        f3303e.append(j.W0, 76);
        f3303e.append(j.B0, 77);
        f3303e.append(j.Z0, 78);
        f3303e.append(j.X, 80);
        f3303e.append(j.W, 81);
    }

    private int[] i(View view, String str) {
        int i10;
        Object f10;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            try {
                i10 = i.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (f10 = ((ConstraintLayout) view.getParent()).f(0, trim)) != null && (f10 instanceof Integer)) {
                i10 = ((Integer) f10).intValue();
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        if (i12 != split.length) {
            return Arrays.copyOf(iArr, i12);
        }
        return iArr;
    }

    private a j(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f3511r);
        o(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a k(int i10) {
        if (!this.f3306c.containsKey(Integer.valueOf(i10))) {
            this.f3306c.put(Integer.valueOf(i10), new a());
        }
        return this.f3306c.get(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        if (resourceId == -1) {
            return typedArray.getInt(i10, -1);
        }
        return resourceId;
    }

    private void o(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != j.f3525t && j.L != index && j.M != index) {
                aVar.f3309c.f3351a = true;
                aVar.f3310d.f3316b = true;
                aVar.f3308b.f3358a = true;
                aVar.f3311e.f3364a = true;
            }
            switch (f3303e.get(index)) {
                case 1:
                    b bVar = aVar.f3310d;
                    bVar.f3339p = n(typedArray, index, bVar.f3339p);
                    break;
                case 2:
                    b bVar2 = aVar.f3310d;
                    bVar2.G = typedArray.getDimensionPixelSize(index, bVar2.G);
                    break;
                case 3:
                    b bVar3 = aVar.f3310d;
                    bVar3.f3338o = n(typedArray, index, bVar3.f3338o);
                    break;
                case 4:
                    b bVar4 = aVar.f3310d;
                    bVar4.f3337n = n(typedArray, index, bVar4.f3337n);
                    break;
                case 5:
                    aVar.f3310d.f3346w = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f3310d;
                    bVar5.A = typedArray.getDimensionPixelOffset(index, bVar5.A);
                    break;
                case 7:
                    b bVar6 = aVar.f3310d;
                    bVar6.B = typedArray.getDimensionPixelOffset(index, bVar6.B);
                    break;
                case 8:
                    b bVar7 = aVar.f3310d;
                    bVar7.H = typedArray.getDimensionPixelSize(index, bVar7.H);
                    break;
                case 9:
                    b bVar8 = aVar.f3310d;
                    bVar8.f3343t = n(typedArray, index, bVar8.f3343t);
                    break;
                case 10:
                    b bVar9 = aVar.f3310d;
                    bVar9.f3342s = n(typedArray, index, bVar9.f3342s);
                    break;
                case 11:
                    b bVar10 = aVar.f3310d;
                    bVar10.M = typedArray.getDimensionPixelSize(index, bVar10.M);
                    break;
                case 12:
                    b bVar11 = aVar.f3310d;
                    bVar11.N = typedArray.getDimensionPixelSize(index, bVar11.N);
                    break;
                case 13:
                    b bVar12 = aVar.f3310d;
                    bVar12.J = typedArray.getDimensionPixelSize(index, bVar12.J);
                    break;
                case 14:
                    b bVar13 = aVar.f3310d;
                    bVar13.L = typedArray.getDimensionPixelSize(index, bVar13.L);
                    break;
                case 15:
                    b bVar14 = aVar.f3310d;
                    bVar14.O = typedArray.getDimensionPixelSize(index, bVar14.O);
                    break;
                case 16:
                    b bVar15 = aVar.f3310d;
                    bVar15.K = typedArray.getDimensionPixelSize(index, bVar15.K);
                    break;
                case 17:
                    b bVar16 = aVar.f3310d;
                    bVar16.f3322e = typedArray.getDimensionPixelOffset(index, bVar16.f3322e);
                    break;
                case 18:
                    b bVar17 = aVar.f3310d;
                    bVar17.f3324f = typedArray.getDimensionPixelOffset(index, bVar17.f3324f);
                    break;
                case 19:
                    b bVar18 = aVar.f3310d;
                    bVar18.f3326g = typedArray.getFloat(index, bVar18.f3326g);
                    break;
                case 20:
                    b bVar19 = aVar.f3310d;
                    bVar19.f3344u = typedArray.getFloat(index, bVar19.f3344u);
                    break;
                case 21:
                    b bVar20 = aVar.f3310d;
                    bVar20.f3320d = typedArray.getLayoutDimension(index, bVar20.f3320d);
                    break;
                case 22:
                    C0062d c0062d = aVar.f3308b;
                    c0062d.f3359b = typedArray.getInt(index, c0062d.f3359b);
                    C0062d c0062d2 = aVar.f3308b;
                    c0062d2.f3359b = f3302d[c0062d2.f3359b];
                    break;
                case 23:
                    b bVar21 = aVar.f3310d;
                    bVar21.f3318c = typedArray.getLayoutDimension(index, bVar21.f3318c);
                    break;
                case 24:
                    b bVar22 = aVar.f3310d;
                    bVar22.D = typedArray.getDimensionPixelSize(index, bVar22.D);
                    break;
                case 25:
                    b bVar23 = aVar.f3310d;
                    bVar23.f3328h = n(typedArray, index, bVar23.f3328h);
                    break;
                case 26:
                    b bVar24 = aVar.f3310d;
                    bVar24.f3330i = n(typedArray, index, bVar24.f3330i);
                    break;
                case 27:
                    b bVar25 = aVar.f3310d;
                    bVar25.C = typedArray.getInt(index, bVar25.C);
                    break;
                case 28:
                    b bVar26 = aVar.f3310d;
                    bVar26.E = typedArray.getDimensionPixelSize(index, bVar26.E);
                    break;
                case 29:
                    b bVar27 = aVar.f3310d;
                    bVar27.f3332j = n(typedArray, index, bVar27.f3332j);
                    break;
                case 30:
                    b bVar28 = aVar.f3310d;
                    bVar28.f3334k = n(typedArray, index, bVar28.f3334k);
                    break;
                case 31:
                    b bVar29 = aVar.f3310d;
                    bVar29.I = typedArray.getDimensionPixelSize(index, bVar29.I);
                    break;
                case 32:
                    b bVar30 = aVar.f3310d;
                    bVar30.f3340q = n(typedArray, index, bVar30.f3340q);
                    break;
                case 33:
                    b bVar31 = aVar.f3310d;
                    bVar31.f3341r = n(typedArray, index, bVar31.f3341r);
                    break;
                case 34:
                    b bVar32 = aVar.f3310d;
                    bVar32.F = typedArray.getDimensionPixelSize(index, bVar32.F);
                    break;
                case 35:
                    b bVar33 = aVar.f3310d;
                    bVar33.f3336m = n(typedArray, index, bVar33.f3336m);
                    break;
                case 36:
                    b bVar34 = aVar.f3310d;
                    bVar34.f3335l = n(typedArray, index, bVar34.f3335l);
                    break;
                case 37:
                    b bVar35 = aVar.f3310d;
                    bVar35.f3345v = typedArray.getFloat(index, bVar35.f3345v);
                    break;
                case 38:
                    aVar.f3307a = typedArray.getResourceId(index, aVar.f3307a);
                    break;
                case 39:
                    b bVar36 = aVar.f3310d;
                    bVar36.Q = typedArray.getFloat(index, bVar36.Q);
                    break;
                case 40:
                    b bVar37 = aVar.f3310d;
                    bVar37.P = typedArray.getFloat(index, bVar37.P);
                    break;
                case 41:
                    b bVar38 = aVar.f3310d;
                    bVar38.R = typedArray.getInt(index, bVar38.R);
                    break;
                case 42:
                    b bVar39 = aVar.f3310d;
                    bVar39.S = typedArray.getInt(index, bVar39.S);
                    break;
                case 43:
                    C0062d c0062d3 = aVar.f3308b;
                    c0062d3.f3361d = typedArray.getFloat(index, c0062d3.f3361d);
                    break;
                case 44:
                    e eVar = aVar.f3311e;
                    eVar.f3375l = true;
                    eVar.f3376m = typedArray.getDimension(index, eVar.f3376m);
                    break;
                case 45:
                    e eVar2 = aVar.f3311e;
                    eVar2.f3366c = typedArray.getFloat(index, eVar2.f3366c);
                    break;
                case 46:
                    e eVar3 = aVar.f3311e;
                    eVar3.f3367d = typedArray.getFloat(index, eVar3.f3367d);
                    break;
                case 47:
                    e eVar4 = aVar.f3311e;
                    eVar4.f3368e = typedArray.getFloat(index, eVar4.f3368e);
                    break;
                case 48:
                    e eVar5 = aVar.f3311e;
                    eVar5.f3369f = typedArray.getFloat(index, eVar5.f3369f);
                    break;
                case 49:
                    e eVar6 = aVar.f3311e;
                    eVar6.f3370g = typedArray.getDimension(index, eVar6.f3370g);
                    break;
                case 50:
                    e eVar7 = aVar.f3311e;
                    eVar7.f3371h = typedArray.getDimension(index, eVar7.f3371h);
                    break;
                case 51:
                    e eVar8 = aVar.f3311e;
                    eVar8.f3372i = typedArray.getDimension(index, eVar8.f3372i);
                    break;
                case 52:
                    e eVar9 = aVar.f3311e;
                    eVar9.f3373j = typedArray.getDimension(index, eVar9.f3373j);
                    break;
                case 53:
                    e eVar10 = aVar.f3311e;
                    eVar10.f3374k = typedArray.getDimension(index, eVar10.f3374k);
                    break;
                case 54:
                    b bVar40 = aVar.f3310d;
                    bVar40.T = typedArray.getInt(index, bVar40.T);
                    break;
                case 55:
                    b bVar41 = aVar.f3310d;
                    bVar41.U = typedArray.getInt(index, bVar41.U);
                    break;
                case 56:
                    b bVar42 = aVar.f3310d;
                    bVar42.V = typedArray.getDimensionPixelSize(index, bVar42.V);
                    break;
                case 57:
                    b bVar43 = aVar.f3310d;
                    bVar43.W = typedArray.getDimensionPixelSize(index, bVar43.W);
                    break;
                case 58:
                    b bVar44 = aVar.f3310d;
                    bVar44.X = typedArray.getDimensionPixelSize(index, bVar44.X);
                    break;
                case 59:
                    b bVar45 = aVar.f3310d;
                    bVar45.Y = typedArray.getDimensionPixelSize(index, bVar45.Y);
                    break;
                case 60:
                    e eVar11 = aVar.f3311e;
                    eVar11.f3365b = typedArray.getFloat(index, eVar11.f3365b);
                    break;
                case 61:
                    b bVar46 = aVar.f3310d;
                    bVar46.f3347x = n(typedArray, index, bVar46.f3347x);
                    break;
                case 62:
                    b bVar47 = aVar.f3310d;
                    bVar47.f3348y = typedArray.getDimensionPixelSize(index, bVar47.f3348y);
                    break;
                case 63:
                    b bVar48 = aVar.f3310d;
                    bVar48.f3349z = typedArray.getFloat(index, bVar48.f3349z);
                    break;
                case 64:
                    c cVar = aVar.f3309c;
                    cVar.f3352b = n(typedArray, index, cVar.f3352b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f3309c.f3353c = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f3309c.f3353c = l2.a.f19497c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f3309c.f3355e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f3309c;
                    cVar2.f3357g = typedArray.getFloat(index, cVar2.f3357g);
                    break;
                case 68:
                    C0062d c0062d4 = aVar.f3308b;
                    c0062d4.f3362e = typedArray.getFloat(index, c0062d4.f3362e);
                    break;
                case 69:
                    aVar.f3310d.Z = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f3310d.f3315a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f3310d;
                    bVar49.f3317b0 = typedArray.getInt(index, bVar49.f3317b0);
                    break;
                case 73:
                    b bVar50 = aVar.f3310d;
                    bVar50.f3319c0 = typedArray.getDimensionPixelSize(index, bVar50.f3319c0);
                    break;
                case 74:
                    aVar.f3310d.f3325f0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f3310d;
                    bVar51.f3333j0 = typedArray.getBoolean(index, bVar51.f3333j0);
                    break;
                case 76:
                    c cVar3 = aVar.f3309c;
                    cVar3.f3354d = typedArray.getInt(index, cVar3.f3354d);
                    break;
                case 77:
                    aVar.f3310d.f3327g0 = typedArray.getString(index);
                    break;
                case 78:
                    C0062d c0062d5 = aVar.f3308b;
                    c0062d5.f3360c = typedArray.getInt(index, c0062d5.f3360c);
                    break;
                case 79:
                    c cVar4 = aVar.f3309c;
                    cVar4.f3356f = typedArray.getFloat(index, cVar4.f3356f);
                    break;
                case 80:
                    b bVar52 = aVar.f3310d;
                    bVar52.f3329h0 = typedArray.getBoolean(index, bVar52.f3329h0);
                    break;
                case 81:
                    b bVar53 = aVar.f3310d;
                    bVar53.f3331i0 = typedArray.getBoolean(index, bVar53.f3331i0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f3303e.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f3303e.get(index));
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f3306c.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f3306c.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + m2.a.a(childAt));
            } else if (this.f3305b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id2 != -1) {
                    if (this.f3306c.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = this.f3306c.get(Integer.valueOf(id2));
                        if (childAt instanceof Barrier) {
                            aVar.f3310d.f3321d0 = 1;
                        }
                        int i11 = aVar.f3310d.f3321d0;
                        if (i11 != -1 && i11 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(aVar.f3310d.f3317b0);
                            barrier.setMargin(aVar.f3310d.f3319c0);
                            barrier.setAllowsGoneWidget(aVar.f3310d.f3333j0);
                            b bVar = aVar.f3310d;
                            int[] iArr = bVar.f3323e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f3325f0;
                                if (str != null) {
                                    bVar.f3323e0 = i(barrier, str);
                                    barrier.setReferencedIds(aVar.f3310d.f3323e0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.d(bVar2);
                        if (z10) {
                            androidx.constraintlayout.widget.a.c(childAt, aVar.f3312f);
                        }
                        childAt.setLayoutParams(bVar2);
                        C0062d c0062d = aVar.f3308b;
                        if (c0062d.f3360c == 0) {
                            childAt.setVisibility(c0062d.f3359b);
                        }
                        childAt.setAlpha(aVar.f3308b.f3361d);
                        childAt.setRotation(aVar.f3311e.f3365b);
                        childAt.setRotationX(aVar.f3311e.f3366c);
                        childAt.setRotationY(aVar.f3311e.f3367d);
                        childAt.setScaleX(aVar.f3311e.f3368e);
                        childAt.setScaleY(aVar.f3311e.f3369f);
                        if (!Float.isNaN(aVar.f3311e.f3370g)) {
                            childAt.setPivotX(aVar.f3311e.f3370g);
                        }
                        if (!Float.isNaN(aVar.f3311e.f3371h)) {
                            childAt.setPivotY(aVar.f3311e.f3371h);
                        }
                        childAt.setTranslationX(aVar.f3311e.f3372i);
                        childAt.setTranslationY(aVar.f3311e.f3373j);
                        childAt.setTranslationZ(aVar.f3311e.f3374k);
                        e eVar = aVar.f3311e;
                        if (eVar.f3375l) {
                            childAt.setElevation(eVar.f3376m);
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.f3306c.get(num);
            int i12 = aVar2.f3310d.f3321d0;
            if (i12 != -1 && i12 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar3 = aVar2.f3310d;
                int[] iArr2 = bVar3.f3323e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f3325f0;
                    if (str2 != null) {
                        bVar3.f3323e0 = i(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f3310d.f3323e0);
                    }
                }
                barrier2.setType(aVar2.f3310d.f3317b0);
                barrier2.setMargin(aVar2.f3310d.f3319c0);
                ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.m();
                aVar2.d(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (aVar2.f3310d.f3314a) {
                View gVar = new g(constraintLayout.getContext());
                gVar.setId(num.intValue());
                ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.d(generateDefaultLayoutParams2);
                constraintLayout.addView(gVar, generateDefaultLayoutParams2);
            }
        }
    }

    public void e(Context context, int i10) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f3306c.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f3305b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f3306c.containsKey(Integer.valueOf(id2))) {
                this.f3306c.put(Integer.valueOf(id2), new a());
            }
            a aVar = this.f3306c.get(Integer.valueOf(id2));
            aVar.f3312f = androidx.constraintlayout.widget.a.a(this.f3304a, childAt);
            aVar.f(id2, bVar);
            aVar.f3308b.f3359b = childAt.getVisibility();
            aVar.f3308b.f3361d = childAt.getAlpha();
            aVar.f3311e.f3365b = childAt.getRotation();
            aVar.f3311e.f3366c = childAt.getRotationX();
            aVar.f3311e.f3367d = childAt.getRotationY();
            aVar.f3311e.f3368e = childAt.getScaleX();
            aVar.f3311e.f3369f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                e eVar = aVar.f3311e;
                eVar.f3370g = pivotX;
                eVar.f3371h = pivotY;
            }
            aVar.f3311e.f3372i = childAt.getTranslationX();
            aVar.f3311e.f3373j = childAt.getTranslationY();
            aVar.f3311e.f3374k = childAt.getTranslationZ();
            e eVar2 = aVar.f3311e;
            if (eVar2.f3375l) {
                eVar2.f3376m = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.f3310d.f3333j0 = barrier.n();
                aVar.f3310d.f3323e0 = barrier.getReferencedIds();
                aVar.f3310d.f3317b0 = barrier.getType();
                aVar.f3310d.f3319c0 = barrier.getMargin();
            }
        }
    }

    public void g(androidx.constraintlayout.widget.e eVar) {
        int childCount = eVar.getChildCount();
        this.f3306c.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = eVar.getChildAt(i10);
            e.a aVar = (e.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f3305b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f3306c.containsKey(Integer.valueOf(id2))) {
                this.f3306c.put(Integer.valueOf(id2), new a());
            }
            a aVar2 = this.f3306c.get(Integer.valueOf(id2));
            if (childAt instanceof androidx.constraintlayout.widget.b) {
                aVar2.h((androidx.constraintlayout.widget.b) childAt, id2, aVar);
            }
            aVar2.g(id2, aVar);
        }
    }

    public void h(int i10, int i11, int i12, float f10) {
        b bVar = k(i10).f3310d;
        bVar.f3347x = i11;
        bVar.f3348y = i12;
        bVar.f3349z = f10;
    }

    public void l(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        a j10 = j(context, Xml.asAttributeSet(xml));
                        if (name.equalsIgnoreCase("Guideline")) {
                            j10.f3310d.f3314a = true;
                        }
                        this.f3306c.put(Integer.valueOf(j10.f3307a), j10);
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0178, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.m(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
