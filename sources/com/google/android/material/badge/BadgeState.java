package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.internal.p;
import java.util.Locale;
import m7.c;
import v6.d;
import v6.i;
import v6.j;
import v6.k;
import v6.l;

/* loaded from: classes3.dex */
public final class BadgeState {

    /* renamed from: a  reason: collision with root package name */
    private final State f9511a;

    /* renamed from: b  reason: collision with root package name */
    private final State f9512b;

    /* renamed from: c  reason: collision with root package name */
    final float f9513c;

    /* renamed from: d  reason: collision with root package name */
    final float f9514d;

    /* renamed from: e  reason: collision with root package name */
    final float f9515e;

    /* renamed from: f  reason: collision with root package name */
    final float f9516f;

    /* renamed from: g  reason: collision with root package name */
    final float f9517g;

    /* renamed from: h  reason: collision with root package name */
    final float f9518h;

    /* renamed from: i  reason: collision with root package name */
    final float f9519i;

    /* renamed from: j  reason: collision with root package name */
    final int f9520j;

    /* renamed from: k  reason: collision with root package name */
    final int f9521k;

    /* renamed from: l  reason: collision with root package name */
    int f9522l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BadgeState(Context context, int i10, int i11, int i12, State state) {
        CharSequence charSequence;
        int i13;
        int i14;
        int i15;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        int intValue7;
        int intValue8;
        int intValue9;
        int intValue10;
        int intValue11;
        Locale locale;
        Locale.Category category;
        State state2 = new State();
        this.f9512b = state2;
        state = state == null ? new State() : state;
        if (i10 != 0) {
            state.f9523f = i10;
        }
        TypedArray a10 = a(context, state.f9523f, i11, i12);
        Resources resources = context.getResources();
        this.f9513c = a10.getDimensionPixelSize(l.J, -1);
        this.f9519i = a10.getDimensionPixelSize(l.O, resources.getDimensionPixelSize(d.M));
        this.f9520j = context.getResources().getDimensionPixelSize(d.L);
        this.f9521k = context.getResources().getDimensionPixelSize(d.N);
        this.f9514d = a10.getDimensionPixelSize(l.R, -1);
        int i16 = l.P;
        int i17 = d.f24683k;
        this.f9515e = a10.getDimension(i16, resources.getDimension(i17));
        int i18 = l.U;
        int i19 = d.f24685l;
        this.f9517g = a10.getDimension(i18, resources.getDimension(i19));
        this.f9516f = a10.getDimension(l.I, resources.getDimension(i17));
        this.f9518h = a10.getDimension(l.Q, resources.getDimension(i19));
        boolean z10 = true;
        this.f9522l = a10.getInt(l.Z, 1);
        state2.f9531v = state.f9531v == -2 ? 255 : state.f9531v;
        if (state.f9535z != null) {
            charSequence = state.f9535z;
        } else {
            charSequence = context.getString(j.f24773i);
        }
        state2.f9535z = charSequence;
        if (state.A != 0) {
            i13 = state.A;
        } else {
            i13 = i.f24764a;
        }
        state2.A = i13;
        if (state.B != 0) {
            i14 = state.B;
        } else {
            i14 = j.f24778n;
        }
        state2.B = i14;
        if (state.D != null && !state.D.booleanValue()) {
            z10 = false;
        }
        state2.D = Boolean.valueOf(z10);
        if (state.f9533x != -2) {
            i15 = state.f9533x;
        } else {
            i15 = a10.getInt(l.X, 4);
        }
        state2.f9533x = i15;
        if (state.f9532w != -2) {
            state2.f9532w = state.f9532w;
        } else {
            int i20 = l.Y;
            if (a10.hasValue(i20)) {
                state2.f9532w = a10.getInt(i20, 0);
            } else {
                state2.f9532w = -1;
            }
        }
        if (state.f9527r != null) {
            intValue = state.f9527r.intValue();
        } else {
            intValue = a10.getResourceId(l.K, k.f24792b);
        }
        state2.f9527r = Integer.valueOf(intValue);
        if (state.f9528s != null) {
            intValue2 = state.f9528s.intValue();
        } else {
            intValue2 = a10.getResourceId(l.L, 0);
        }
        state2.f9528s = Integer.valueOf(intValue2);
        if (state.f9529t != null) {
            intValue3 = state.f9529t.intValue();
        } else {
            intValue3 = a10.getResourceId(l.S, k.f24792b);
        }
        state2.f9529t = Integer.valueOf(intValue3);
        if (state.f9530u != null) {
            intValue4 = state.f9530u.intValue();
        } else {
            intValue4 = a10.getResourceId(l.T, 0);
        }
        state2.f9530u = Integer.valueOf(intValue4);
        if (state.f9524m != null) {
            intValue5 = state.f9524m.intValue();
        } else {
            intValue5 = y(context, a10, l.G);
        }
        state2.f9524m = Integer.valueOf(intValue5);
        if (state.f9526q != null) {
            intValue6 = state.f9526q.intValue();
        } else {
            intValue6 = a10.getResourceId(l.M, k.f24796f);
        }
        state2.f9526q = Integer.valueOf(intValue6);
        if (state.f9525p != null) {
            state2.f9525p = state.f9525p;
        } else {
            int i21 = l.N;
            if (a10.hasValue(i21)) {
                state2.f9525p = Integer.valueOf(y(context, a10, i21));
            } else {
                state2.f9525p = Integer.valueOf(new m7.d(context, state2.f9526q.intValue()).i().getDefaultColor());
            }
        }
        if (state.C != null) {
            intValue7 = state.C.intValue();
        } else {
            intValue7 = a10.getInt(l.H, 8388661);
        }
        state2.C = Integer.valueOf(intValue7);
        if (state.E != null) {
            intValue8 = state.E.intValue();
        } else {
            intValue8 = a10.getDimensionPixelOffset(l.V, 0);
        }
        state2.E = Integer.valueOf(intValue8);
        if (state.F != null) {
            intValue9 = state.F.intValue();
        } else {
            intValue9 = a10.getDimensionPixelOffset(l.f24818a0, 0);
        }
        state2.F = Integer.valueOf(intValue9);
        if (state.G != null) {
            intValue10 = state.G.intValue();
        } else {
            intValue10 = a10.getDimensionPixelOffset(l.W, state2.E.intValue());
        }
        state2.G = Integer.valueOf(intValue10);
        if (state.H != null) {
            intValue11 = state.H.intValue();
        } else {
            intValue11 = a10.getDimensionPixelOffset(l.f24828b0, state2.F.intValue());
        }
        state2.H = Integer.valueOf(intValue11);
        state2.I = Integer.valueOf(state.I == null ? 0 : state.I.intValue());
        state2.J = Integer.valueOf(state.J != null ? state.J.intValue() : 0);
        a10.recycle();
        if (state.f9534y != null) {
            state2.f9534y = state.f9534y;
        } else {
            if (Build.VERSION.SDK_INT >= 24) {
                category = Locale.Category.FORMAT;
                locale = Locale.getDefault(category);
            } else {
                locale = Locale.getDefault();
            }
            state2.f9534y = locale;
        }
        this.f9511a = state;
    }

    private TypedArray a(Context context, int i10, int i11, int i12) {
        AttributeSet attributeSet;
        int i13;
        int i14;
        if (i10 != 0) {
            AttributeSet e10 = f7.d.e(context, i10, "badge");
            i13 = e10.getStyleAttribute();
            attributeSet = e10;
        } else {
            attributeSet = null;
            i13 = 0;
        }
        if (i13 == 0) {
            i14 = i12;
        } else {
            i14 = i13;
        }
        return p.i(context, attributeSet, l.F, i11, i14, new int[0]);
    }

    private static int y(Context context, TypedArray typedArray, int i10) {
        return c.a(context, typedArray, i10).getDefaultColor();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f9512b.I.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f9512b.J.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        return this.f9512b.f9531v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f9512b.f9524m.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f9512b.C.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f9512b.f9528s.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return this.f9512b.f9527r.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f9512b.f9525p.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f9512b.f9530u.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f9512b.f9529t.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l() {
        return this.f9512b.B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence m() {
        return this.f9512b.f9535z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.f9512b.A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        return this.f9512b.G.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p() {
        return this.f9512b.E.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int q() {
        return this.f9512b.f9533x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int r() {
        return this.f9512b.f9532w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Locale s() {
        return this.f9512b.f9534y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int t() {
        return this.f9512b.f9526q.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int u() {
        return this.f9512b.H.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int v() {
        return this.f9512b.F.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w() {
        if (this.f9512b.f9532w != -1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        return this.f9512b.D.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(int i10) {
        this.f9511a.f9531v = i10;
        this.f9512b.f9531v = i10;
    }

    /* loaded from: classes3.dex */
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new a();
        private int A;
        private int B;
        private Integer C;
        private Boolean D;
        private Integer E;
        private Integer F;
        private Integer G;
        private Integer H;
        private Integer I;
        private Integer J;

        /* renamed from: f  reason: collision with root package name */
        private int f9523f;

        /* renamed from: m  reason: collision with root package name */
        private Integer f9524m;

        /* renamed from: p  reason: collision with root package name */
        private Integer f9525p;

        /* renamed from: q  reason: collision with root package name */
        private Integer f9526q;

        /* renamed from: r  reason: collision with root package name */
        private Integer f9527r;

        /* renamed from: s  reason: collision with root package name */
        private Integer f9528s;

        /* renamed from: t  reason: collision with root package name */
        private Integer f9529t;

        /* renamed from: u  reason: collision with root package name */
        private Integer f9530u;

        /* renamed from: v  reason: collision with root package name */
        private int f9531v;

        /* renamed from: w  reason: collision with root package name */
        private int f9532w;

        /* renamed from: x  reason: collision with root package name */
        private int f9533x;

        /* renamed from: y  reason: collision with root package name */
        private Locale f9534y;

        /* renamed from: z  reason: collision with root package name */
        private CharSequence f9535z;

        /* loaded from: classes3.dex */
        class a implements Parcelable.Creator<State> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public State[] newArray(int i10) {
                return new State[i10];
            }
        }

        public State() {
            this.f9531v = 255;
            this.f9532w = -2;
            this.f9533x = -2;
            this.D = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            String charSequence;
            parcel.writeInt(this.f9523f);
            parcel.writeSerializable(this.f9524m);
            parcel.writeSerializable(this.f9525p);
            parcel.writeSerializable(this.f9526q);
            parcel.writeSerializable(this.f9527r);
            parcel.writeSerializable(this.f9528s);
            parcel.writeSerializable(this.f9529t);
            parcel.writeSerializable(this.f9530u);
            parcel.writeInt(this.f9531v);
            parcel.writeInt(this.f9532w);
            parcel.writeInt(this.f9533x);
            CharSequence charSequence2 = this.f9535z;
            if (charSequence2 == null) {
                charSequence = null;
            } else {
                charSequence = charSequence2.toString();
            }
            parcel.writeString(charSequence);
            parcel.writeInt(this.A);
            parcel.writeSerializable(this.C);
            parcel.writeSerializable(this.E);
            parcel.writeSerializable(this.F);
            parcel.writeSerializable(this.G);
            parcel.writeSerializable(this.H);
            parcel.writeSerializable(this.I);
            parcel.writeSerializable(this.J);
            parcel.writeSerializable(this.D);
            parcel.writeSerializable(this.f9534y);
        }

        State(Parcel parcel) {
            this.f9531v = 255;
            this.f9532w = -2;
            this.f9533x = -2;
            this.D = Boolean.TRUE;
            this.f9523f = parcel.readInt();
            this.f9524m = (Integer) parcel.readSerializable();
            this.f9525p = (Integer) parcel.readSerializable();
            this.f9526q = (Integer) parcel.readSerializable();
            this.f9527r = (Integer) parcel.readSerializable();
            this.f9528s = (Integer) parcel.readSerializable();
            this.f9529t = (Integer) parcel.readSerializable();
            this.f9530u = (Integer) parcel.readSerializable();
            this.f9531v = parcel.readInt();
            this.f9532w = parcel.readInt();
            this.f9533x = parcel.readInt();
            this.f9535z = parcel.readString();
            this.A = parcel.readInt();
            this.C = (Integer) parcel.readSerializable();
            this.E = (Integer) parcel.readSerializable();
            this.F = (Integer) parcel.readSerializable();
            this.G = (Integer) parcel.readSerializable();
            this.H = (Integer) parcel.readSerializable();
            this.I = (Integer) parcel.readSerializable();
            this.J = (Integer) parcel.readSerializable();
            this.D = (Boolean) parcel.readSerializable();
            this.f9534y = (Locale) parcel.readSerializable();
        }
    }
}
