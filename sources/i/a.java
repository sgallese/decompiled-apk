package i;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.collection.h;
import androidx.core.content.res.l;
import i.b;
import i.e;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedStateListDrawableCompat.java */
/* loaded from: classes.dex */
public class a extends i.e implements androidx.core.graphics.drawable.c {
    private c B;
    private g C;
    private int D;
    private int E;
    private boolean F;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: a  reason: collision with root package name */
        private final Animatable f16654a;

        b(Animatable animatable) {
            super();
            this.f16654a = animatable;
        }

        @Override // i.a.g
        public void c() {
            this.f16654a.start();
        }

        @Override // i.a.g
        public void d() {
            this.f16654a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends e.a {
        androidx.collection.e<Long> K;
        h<Integer> L;

        c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
                return;
            }
            this.K = new androidx.collection.e<>();
            this.L = new h<>();
        }

        private static long D(int i10, int i11) {
            return i11 | (i10 << 32);
        }

        int B(int[] iArr, Drawable drawable, int i10) {
            int z10 = super.z(iArr, drawable);
            this.L.n(z10, Integer.valueOf(i10));
            return z10;
        }

        int C(int i10, int i11, Drawable drawable, boolean z10) {
            long j10;
            int a10 = super.a(drawable);
            long D = D(i10, i11);
            if (z10) {
                j10 = 8589934592L;
            } else {
                j10 = 0;
            }
            long j11 = a10;
            this.K.a(D, Long.valueOf(j11 | j10));
            if (z10) {
                this.K.a(D(i11, i10), Long.valueOf(4294967296L | j11 | j10));
            }
            return a10;
        }

        int E(int i10) {
            if (i10 < 0) {
                return 0;
            }
            return this.L.h(i10, 0).intValue();
        }

        int F(int[] iArr) {
            int A = super.A(iArr);
            if (A >= 0) {
                return A;
            }
            return super.A(StateSet.WILD_CARD);
        }

        int G(int i10, int i11) {
            return (int) this.K.g(D(i10, i11), -1L).longValue();
        }

        boolean H(int i10, int i11) {
            if ((this.K.g(D(i10, i11), -1L).longValue() & 4294967296L) != 0) {
                return true;
            }
            return false;
        }

        boolean I(int i10, int i11) {
            if ((this.K.g(D(i10, i11), -1L).longValue() & 8589934592L) != 0) {
                return true;
            }
            return false;
        }

        @Override // i.e.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // i.e.a, i.b.d
        void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // i.e.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.e f16655a;

        d(androidx.vectordrawable.graphics.drawable.e eVar) {
            super();
            this.f16655a = eVar;
        }

        @Override // i.a.g
        public void c() {
            this.f16655a.start();
        }

        @Override // i.a.g
        public void d() {
            this.f16655a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class e extends g {

        /* renamed from: a  reason: collision with root package name */
        private final ObjectAnimator f16656a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f16657b;

        e(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            super();
            int i10;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z10) {
                i10 = numberOfFrames - 1;
            } else {
                i10 = 0;
            }
            int i11 = z10 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z10);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
            j.b.a(ofInt, true);
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.f16657b = z11;
            this.f16656a = ofInt;
        }

        @Override // i.a.g
        public boolean a() {
            return this.f16657b;
        }

        @Override // i.a.g
        public void b() {
            this.f16656a.reverse();
        }

        @Override // i.a.g
        public void c() {
            this.f16656a.start();
        }

        @Override // i.a.g
        public void d() {
            this.f16656a.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    private static class f implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        private int[] f16658a;

        /* renamed from: b  reason: collision with root package name */
        private int f16659b;

        /* renamed from: c  reason: collision with root package name */
        private int f16660c;

        f(AnimationDrawable animationDrawable, boolean z10) {
            b(animationDrawable, z10);
        }

        int a() {
            return this.f16660c;
        }

        int b(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f16659b = numberOfFrames;
            int[] iArr = this.f16658a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f16658a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f16658a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f16660c = i10;
            return i10;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11;
            int i10 = (int) ((f10 * this.f16660c) + 0.5f);
            int i11 = this.f16659b;
            int[] iArr = this.f16658a;
            int i12 = 0;
            while (i12 < i11) {
                int i13 = iArr[i12];
                if (i10 < i13) {
                    break;
                }
                i10 -= i13;
                i12++;
            }
            if (i12 < i11) {
                f11 = i10 / this.f16660c;
            } else {
                f11 = 0.0f;
            }
            return (i12 / i11) + f11;
        }
    }

    public a() {
        this(null, null);
    }

    public static a m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth) {
                        if (xmlPullParser.getName().equals("item")) {
                            q(context, resources, xmlPullParser, attributeSet, theme);
                        } else if (xmlPullParser.getName().equals("transition")) {
                            r(context, resources, xmlPullParser, attributeSet, theme);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private void p() {
        onStateChange(getState());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r5 != 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r7.getName().equals("vector") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r5 = androidx.vectordrawable.graphics.drawable.j.c(r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        r5 = j.c.a(r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r5 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r4.B.B(r0, r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        r5 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if (r5 != 4) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int q(android.content.Context r5, android.content.res.Resources r6, org.xmlpull.v1.XmlPullParser r7, android.util.AttributeSet r8, android.content.res.Resources.Theme r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r4 = this;
            int[] r0 = j.e.f18500h
            android.content.res.TypedArray r0 = androidx.core.content.res.l.s(r6, r9, r8, r0)
            int r1 = j.e.f18501i
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            int r2 = j.e.f18502j
            r3 = -1
            int r2 = r0.getResourceId(r2, r3)
            if (r2 <= 0) goto L1f
            androidx.appcompat.widget.w0 r3 = androidx.appcompat.widget.w0.h()
            android.graphics.drawable.Drawable r5 = r3.j(r5, r2)
            goto L20
        L1f:
            r5 = 0
        L20:
            r0.recycle()
            int[] r0 = r4.k(r8)
            java.lang.String r2 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r5 != 0) goto L65
        L2b:
            int r5 = r7.next()
            r3 = 4
            if (r5 != r3) goto L33
            goto L2b
        L33:
            r3 = 2
            if (r5 != r3) goto L4c
            java.lang.String r5 = r7.getName()
            java.lang.String r3 = "vector"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L47
            androidx.vectordrawable.graphics.drawable.j r5 = androidx.vectordrawable.graphics.drawable.j.c(r6, r7, r8, r9)
            goto L65
        L47:
            android.graphics.drawable.Drawable r5 = j.c.a(r6, r7, r8, r9)
            goto L65
        L4c:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L65:
            if (r5 == 0) goto L6e
            i.a$c r6 = r4.B
            int r5 = r6.B(r0, r5, r1)
            return r5
        L6e:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.q(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r4 != 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r10.getName().equals("animated-vector") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        r4 = androidx.vectordrawable.graphics.drawable.e.b(r8, r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        r4 = j.c.a(r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r4 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r1 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r3 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        return r7.B.C(r1, r3, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        r4 = r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (r4 != 4) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int r(android.content.Context r8, android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r7 = this;
            int[] r0 = j.e.f18503k
            android.content.res.TypedArray r0 = androidx.core.content.res.l.s(r9, r12, r11, r0)
            int r1 = j.e.f18506n
            r2 = -1
            int r1 = r0.getResourceId(r1, r2)
            int r3 = j.e.f18505m
            int r3 = r0.getResourceId(r3, r2)
            int r4 = j.e.f18504l
            int r4 = r0.getResourceId(r4, r2)
            if (r4 <= 0) goto L24
            androidx.appcompat.widget.w0 r5 = androidx.appcompat.widget.w0.h()
            android.graphics.drawable.Drawable r4 = r5.j(r8, r4)
            goto L25
        L24:
            r4 = 0
        L25:
            int r5 = j.e.f18507o
            r6 = 0
            boolean r5 = r0.getBoolean(r5, r6)
            r0.recycle()
            java.lang.String r0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r4 != 0) goto L6d
        L33:
            int r4 = r10.next()
            r6 = 4
            if (r4 != r6) goto L3b
            goto L33
        L3b:
            r6 = 2
            if (r4 != r6) goto L54
            java.lang.String r4 = r10.getName()
            java.lang.String r6 = "animated-vector"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L4f
            androidx.vectordrawable.graphics.drawable.e r4 = androidx.vectordrawable.graphics.drawable.e.b(r8, r9, r10, r11, r12)
            goto L6d
        L4f:
            android.graphics.drawable.Drawable r4 = j.c.a(r9, r10, r11, r12)
            goto L6d
        L54:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L6d:
            if (r4 == 0) goto L95
            if (r1 == r2) goto L7a
            if (r3 == r2) goto L7a
            i.a$c r8 = r7.B
            int r8 = r8.C(r1, r3, r4, r5)
            return r8
        L7a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L95:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.r(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    private boolean s(int i10) {
        int c10;
        int G;
        g bVar;
        g gVar = this.C;
        if (gVar != null) {
            if (i10 == this.D) {
                return true;
            }
            if (i10 == this.E && gVar.a()) {
                gVar.b();
                this.D = this.E;
                this.E = i10;
                return true;
            }
            c10 = this.D;
            gVar.d();
        } else {
            c10 = c();
        }
        this.C = null;
        this.E = -1;
        this.D = -1;
        c cVar = this.B;
        int E = cVar.E(c10);
        int E2 = cVar.E(i10);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.I(E, E2);
        g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(E, E2), I);
        } else if (current instanceof androidx.vectordrawable.graphics.drawable.e) {
            bVar = new d((androidx.vectordrawable.graphics.drawable.e) current);
        } else {
            if (current instanceof Animatable) {
                bVar = new b((Animatable) current);
            }
            return false;
        }
        bVar.c();
        this.C = bVar;
        this.E = c10;
        this.D = i10;
        return true;
    }

    private void t(TypedArray typedArray) {
        c cVar = this.B;
        cVar.f16678d |= j.c.b(typedArray);
        cVar.x(typedArray.getBoolean(j.e.f18496d, cVar.f16683i));
        cVar.t(typedArray.getBoolean(j.e.f18497e, cVar.f16686l));
        cVar.u(typedArray.getInt(j.e.f18498f, cVar.A));
        cVar.v(typedArray.getInt(j.e.f18499g, cVar.B));
        setDither(typedArray.getBoolean(j.e.f18494b, cVar.f16698x));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // i.e, i.b
    public void h(b.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.B = (c) dVar;
        }
    }

    @Override // i.e, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.C;
        if (gVar != null) {
            gVar.d();
            this.C = null;
            g(this.D);
            this.D = -1;
            this.E = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // i.e
    /* renamed from: l  reason: merged with bridge method [inline-methods] */
    public c b() {
        return new c(this.B, this, null);
    }

    @Override // i.e, i.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.F && super.mutate() == this) {
            this.B.r();
            this.F = true;
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s10 = l.s(resources, theme, attributeSet, j.e.f18493a);
        setVisible(s10.getBoolean(j.e.f18495c, true), true);
        t(s10);
        i(resources);
        s10.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i.e, i.b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        int F = this.B.F(iArr);
        if (F != c() && (s(F) || g(F))) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable current = getCurrent();
        if (current != null) {
            return z10 | current.setState(iArr);
        }
        return z10;
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        g gVar = this.C;
        if (gVar != null && (visible || z11)) {
            if (z10) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    a(c cVar, Resources resources) {
        super(null);
        this.D = -1;
        this.E = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public abstract void c();

        public abstract void d();

        public void b() {
        }
    }
}
