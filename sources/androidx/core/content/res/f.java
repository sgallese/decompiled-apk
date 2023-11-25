package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GradientColorInflaterCompat.java */
/* loaded from: classes.dex */
public final class f {
    private static a a(a aVar, int i10, int i11, boolean z10, int i12) {
        if (aVar != null) {
            return aVar;
        }
        if (z10) {
            return new a(i10, i12, i11);
        }
        return new a(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray s10 = l.s(resources, theme, attributeSet, r2.g.A);
            float j10 = l.j(s10, xmlPullParser, "startX", r2.g.J, 0.0f);
            float j11 = l.j(s10, xmlPullParser, "startY", r2.g.K, 0.0f);
            float j12 = l.j(s10, xmlPullParser, "endX", r2.g.L, 0.0f);
            float j13 = l.j(s10, xmlPullParser, "endY", r2.g.M, 0.0f);
            float j14 = l.j(s10, xmlPullParser, "centerX", r2.g.E, 0.0f);
            float j15 = l.j(s10, xmlPullParser, "centerY", r2.g.F, 0.0f);
            int k10 = l.k(s10, xmlPullParser, TaskFormActivity.TASK_TYPE_KEY, r2.g.D, 0);
            int f10 = l.f(s10, xmlPullParser, "startColor", r2.g.B, 0);
            boolean r10 = l.r(xmlPullParser, "centerColor");
            int f11 = l.f(s10, xmlPullParser, "centerColor", r2.g.I, 0);
            int f12 = l.f(s10, xmlPullParser, "endColor", r2.g.C, 0);
            int k11 = l.k(s10, xmlPullParser, "tileMode", r2.g.H, 0);
            float j16 = l.j(s10, xmlPullParser, "gradientRadius", r2.g.G, 0.0f);
            s10.recycle();
            a a10 = a(c(resources, xmlPullParser, attributeSet, theme), f10, f12, r10, f11);
            if (k10 != 1) {
                if (k10 != 2) {
                    return new LinearGradient(j10, j11, j12, j13, a10.f3842a, a10.f3843b, d(k11));
                }
                return new SweepGradient(j14, j15, a10.f3842a, a10.f3843b);
            } else if (j16 > 0.0f) {
                return new RadialGradient(j14, j15, j16, a10.f3842a, a10.f3843b, d(k11));
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.core.content.res.f.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = r2.g.N
            android.content.res.TypedArray r3 = androidx.core.content.res.l.s(r9, r12, r11, r3)
            int r5 = r2.g.O
            boolean r6 = r3.hasValue(r5)
            int r7 = r2.g.P
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            androidx.core.content.res.f$a r9 = new androidx.core.content.res.f$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.f$a");
    }

    private static Shader.TileMode d(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return Shader.TileMode.CLAMP;
            }
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GradientColorInflaterCompat.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int[] f3842a;

        /* renamed from: b  reason: collision with root package name */
        final float[] f3843b;

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f3842a = new int[size];
            this.f3843b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f3842a[i10] = list.get(i10).intValue();
                this.f3843b[i10] = list2.get(i10).floatValue();
            }
        }

        a(int i10, int i11) {
            this.f3842a = new int[]{i10, i11};
            this.f3843b = new float[]{0.0f, 1.0f};
        }

        a(int i10, int i11, int i12) {
            this.f3842a = new int[]{i10, i11, i12};
            this.f3843b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
