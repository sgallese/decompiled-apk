package a1;

import a1.a1;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;

/* compiled from: AndroidBlendMode.android.kt */
/* loaded from: classes.dex */
public final class d0 {
    public static final BlendMode a(int i10) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        a1.a aVar = a1.f62b;
        if (a1.G(i10, aVar.a())) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        } else if (a1.G(i10, aVar.x())) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        } else if (a1.G(i10, aVar.g())) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        } else if (a1.G(i10, aVar.B())) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        } else if (a1.G(i10, aVar.k())) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        } else if (a1.G(i10, aVar.z())) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        } else if (a1.G(i10, aVar.i())) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        } else if (a1.G(i10, aVar.A())) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        } else if (a1.G(i10, aVar.j())) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        } else if (a1.G(i10, aVar.y())) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        } else if (a1.G(i10, aVar.h())) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        } else if (a1.G(i10, aVar.C())) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        } else if (a1.G(i10, aVar.t())) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        } else if (a1.G(i10, aVar.q())) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        } else if (a1.G(i10, aVar.v())) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        } else if (a1.G(i10, aVar.s())) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        } else if (a1.G(i10, aVar.e())) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        } else if (a1.G(i10, aVar.o())) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        } else if (a1.G(i10, aVar.d())) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        } else if (a1.G(i10, aVar.c())) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        } else if (a1.G(i10, aVar.m())) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        } else if (a1.G(i10, aVar.w())) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        } else if (a1.G(i10, aVar.f())) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        } else if (a1.G(i10, aVar.l())) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        } else if (a1.G(i10, aVar.r())) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        } else if (a1.G(i10, aVar.n())) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        } else if (a1.G(i10, aVar.u())) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        } else if (a1.G(i10, aVar.b())) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        } else if (a1.G(i10, aVar.p())) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        } else {
            blendMode = BlendMode.SRC_OVER;
            return blendMode;
        }
    }

    public static final PorterDuff.Mode b(int i10) {
        a1.a aVar = a1.f62b;
        if (a1.G(i10, aVar.a())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (a1.G(i10, aVar.x())) {
            return PorterDuff.Mode.SRC;
        }
        if (a1.G(i10, aVar.g())) {
            return PorterDuff.Mode.DST;
        }
        if (a1.G(i10, aVar.B())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (a1.G(i10, aVar.k())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (a1.G(i10, aVar.z())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (a1.G(i10, aVar.i())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (a1.G(i10, aVar.A())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (a1.G(i10, aVar.j())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (a1.G(i10, aVar.y())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (a1.G(i10, aVar.h())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (a1.G(i10, aVar.C())) {
            return PorterDuff.Mode.XOR;
        }
        if (a1.G(i10, aVar.t())) {
            return PorterDuff.Mode.ADD;
        }
        if (a1.G(i10, aVar.v())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (a1.G(i10, aVar.s())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (a1.G(i10, aVar.e())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (a1.G(i10, aVar.o())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (a1.G(i10, aVar.q())) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
