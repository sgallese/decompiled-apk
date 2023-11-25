package androidx.core.text;

import java.util.Locale;

/* compiled from: TextDirectionHeuristicsCompat.java */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final u f4035a = new e(null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final u f4036b = new e(null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final u f4037c;

    /* renamed from: d  reason: collision with root package name */
    public static final u f4038d;

    /* renamed from: e  reason: collision with root package name */
    public static final u f4039e;

    /* renamed from: f  reason: collision with root package name */
    public static final u f4040f;

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    private static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        static final a f4041b = new a(true);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f4042a;

        private a(boolean z10) {
            this.f4042a = z10;
        }

        @Override // androidx.core.text.v.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int a10 = v.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (a10 != 0) {
                    if (a10 == 1) {
                        if (!this.f4042a) {
                            return 1;
                        }
                    } else {
                        continue;
                        i10++;
                    }
                } else if (this.f4042a) {
                    return 0;
                }
                z10 = true;
                i10++;
            }
            if (z10) {
                return this.f4042a ? 1 : 0;
            }
            return 2;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    private static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        static final b f4043a = new b();

        private b() {
        }

        @Override // androidx.core.text.v.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                i13 = v.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    public interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    private static abstract class d implements u {

        /* renamed from: a  reason: collision with root package name */
        private final c f4044a;

        d(c cVar) {
            this.f4044a = cVar;
        }

        private boolean c(CharSequence charSequence, int i10, int i11) {
            int a10 = this.f4044a.a(charSequence, i10, i11);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                return b();
            }
            return false;
        }

        @Override // androidx.core.text.u
        public boolean a(CharSequence charSequence, int i10, int i11) {
            if (charSequence != null && i10 >= 0 && i11 >= 0 && charSequence.length() - i11 >= i10) {
                if (this.f4044a == null) {
                    return b();
                }
                return c(charSequence, i10, i11);
            }
            throw new IllegalArgumentException();
        }

        protected abstract boolean b();
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    private static class e extends d {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f4045b;

        e(c cVar, boolean z10) {
            super(cVar);
            this.f4045b = z10;
        }

        @Override // androidx.core.text.v.d
        protected boolean b() {
            return this.f4045b;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* loaded from: classes.dex */
    private static class f extends d {

        /* renamed from: b  reason: collision with root package name */
        static final f f4046b = new f();

        f() {
            super(null);
        }

        @Override // androidx.core.text.v.d
        protected boolean b() {
            if (w.a(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }

    static {
        b bVar = b.f4043a;
        f4037c = new e(bVar, false);
        f4038d = new e(bVar, true);
        f4039e = new e(a.f4041b, false);
        f4040f = f.f4046b;
    }

    static int a(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 != 1 && i10 != 2) {
            return 2;
        }
        return 0;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
