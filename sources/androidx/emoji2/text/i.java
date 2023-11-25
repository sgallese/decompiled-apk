package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.f;
import androidx.emoji2.text.n;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EmojiProcessor.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final f.j f4404a;

    /* renamed from: b  reason: collision with root package name */
    private final n f4405b;

    /* renamed from: c  reason: collision with root package name */
    private f.e f4406c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f4407d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f4408e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmojiProcessor.java */
    /* loaded from: classes.dex */
    public static final class a {
        static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        if (z10) {
                            return -1;
                        }
                        return 0;
                    }
                    char charAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i11--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z10) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i11--;
                        i10++;
                    } else if (Character.isLowSurrogate(charAt)) {
                        return -1;
                    } else {
                        i10++;
                        z10 = true;
                    }
                }
                return i10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmojiProcessor.java */
    /* loaded from: classes.dex */
    public static class b implements c<t> {

        /* renamed from: a  reason: collision with root package name */
        public t f4409a;

        /* renamed from: b  reason: collision with root package name */
        private final f.j f4410b;

        b(t tVar, f.j jVar) {
            this.f4409a = tVar;
            this.f4410b = jVar;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean b(CharSequence charSequence, int i10, int i11, p pVar) {
            Spannable spannableString;
            if (pVar.k()) {
                return true;
            }
            if (this.f4409a == null) {
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                this.f4409a = new t(spannableString);
            }
            this.f4409a.setSpan(this.f4410b.a(pVar), i10, i11, 33);
            return true;
        }

        @Override // androidx.emoji2.text.i.c
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public t a() {
            return this.f4409a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmojiProcessor.java */
    /* loaded from: classes.dex */
    public interface c<T> {
        T a();

        boolean b(CharSequence charSequence, int i10, int i11, p pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmojiProcessor.java */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        private int f4415a = 1;

        /* renamed from: b  reason: collision with root package name */
        private final n.a f4416b;

        /* renamed from: c  reason: collision with root package name */
        private n.a f4417c;

        /* renamed from: d  reason: collision with root package name */
        private n.a f4418d;

        /* renamed from: e  reason: collision with root package name */
        private int f4419e;

        /* renamed from: f  reason: collision with root package name */
        private int f4420f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f4421g;

        /* renamed from: h  reason: collision with root package name */
        private final int[] f4422h;

        f(n.a aVar, boolean z10, int[] iArr) {
            this.f4416b = aVar;
            this.f4417c = aVar;
            this.f4421g = z10;
            this.f4422h = iArr;
        }

        private static boolean d(int i10) {
            if (i10 == 65039) {
                return true;
            }
            return false;
        }

        private static boolean f(int i10) {
            if (i10 == 65038) {
                return true;
            }
            return false;
        }

        private int g() {
            this.f4415a = 1;
            this.f4417c = this.f4416b;
            this.f4420f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f4417c.b().j() || d(this.f4419e)) {
                return true;
            }
            if (this.f4421g) {
                if (this.f4422h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f4422h, this.f4417c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i10) {
            n.a a10 = this.f4417c.a(i10);
            int i11 = 2;
            if (this.f4415a != 2) {
                if (a10 == null) {
                    i11 = g();
                } else {
                    this.f4415a = 2;
                    this.f4417c = a10;
                    this.f4420f = 1;
                }
            } else if (a10 != null) {
                this.f4417c = a10;
                this.f4420f++;
            } else if (f(i10)) {
                i11 = g();
            } else if (!d(i10)) {
                if (this.f4417c.b() != null) {
                    i11 = 3;
                    if (this.f4420f == 1) {
                        if (h()) {
                            this.f4418d = this.f4417c;
                            g();
                        } else {
                            i11 = g();
                        }
                    } else {
                        this.f4418d = this.f4417c;
                        g();
                    }
                } else {
                    i11 = g();
                }
            }
            this.f4419e = i10;
            return i11;
        }

        p b() {
            return this.f4417c.b();
        }

        p c() {
            return this.f4418d.b();
        }

        boolean e() {
            if (this.f4415a == 2 && this.f4417c.b() != null && (this.f4420f > 1 || h())) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(n nVar, f.j jVar, f.e eVar, boolean z10, int[] iArr, Set<int[]> set) {
        this.f4404a = jVar;
        this.f4405b = nVar;
        this.f4406c = eVar;
        this.f4407d = z10;
        this.f4408e = iArr;
        i(set);
    }

    private static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        j[] jVarArr;
        if (h(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!g(selectionStart, selectionEnd) && (jVarArr = (j[]) editable.getSpans(selectionStart, selectionEnd, j.class)) != null && jVarArr.length > 0) {
            for (j jVar : jVarArr) {
                int spanStart = editable.getSpanStart(jVar);
                int spanEnd = editable.getSpanEnd(jVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (g(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                max = a.a(editable, selectionStart, Math.max(i10, 0));
                min = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i10, 0);
                min = Math.min(selectionEnd + i11, editable.length());
            }
            j[] jVarArr = (j[]) editable.getSpans(max, min, j.class);
            if (jVarArr != null && jVarArr.length > 0) {
                for (j jVar : jVarArr) {
                    int spanStart = editable.getSpanStart(jVar);
                    int spanEnd = editable.getSpanEnd(jVar);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(Editable editable, int i10, KeyEvent keyEvent) {
        boolean a10;
        if (i10 != 67) {
            if (i10 != 112) {
                a10 = false;
            } else {
                a10 = a(editable, keyEvent, true);
            }
        } else {
            a10 = a(editable, keyEvent, false);
        }
        if (!a10) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean f(CharSequence charSequence, int i10, int i11, p pVar) {
        if (pVar.d() == 0) {
            pVar.m(this.f4406c.a(charSequence, i10, i11, pVar.h()));
        }
        if (pVar.d() == 2) {
            return true;
        }
        return false;
    }

    private static boolean g(int i10, int i11) {
        if (i10 != -1 && i11 != -1 && i10 == i11) {
            return false;
        }
        return true;
    }

    private static boolean h(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void i(Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            String str = new String(iArr, 0, iArr.length);
            k(str, 0, str.length(), 1, true, new e(str));
        }
    }

    private <T> T k(CharSequence charSequence, int i10, int i11, int i12, boolean z10, c<T> cVar) {
        int i13;
        f fVar = new f(this.f4405b.f(), this.f4407d, this.f4408e);
        int codePointAt = Character.codePointAt(charSequence, i10);
        int i14 = 0;
        boolean z11 = true;
        loop0: while (true) {
            i13 = i10;
            while (i10 < i11 && i14 < i12 && z11) {
                int a10 = fVar.a(codePointAt);
                if (a10 != 1) {
                    if (a10 != 2) {
                        if (a10 == 3) {
                            if (z10 || !f(charSequence, i13, i10, fVar.c())) {
                                i14++;
                                z11 = cVar.b(charSequence, i13, i10, fVar.c());
                            }
                        }
                    } else {
                        i10 += Character.charCount(codePointAt);
                        if (i10 < i11) {
                            codePointAt = Character.codePointAt(charSequence, i10);
                        }
                    }
                } else {
                    i13 += Character.charCount(Character.codePointAt(charSequence, i13));
                    if (i13 < i11) {
                        codePointAt = Character.codePointAt(charSequence, i13);
                    }
                    i10 = i13;
                }
            }
        }
        if (fVar.e() && i14 < i12 && z11 && (z10 || !f(charSequence, i13, i10, fVar.b()))) {
            cVar.b(charSequence, i13, i10, fVar.b());
        }
        return cVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(CharSequence charSequence, int i10) {
        if (i10 >= 0 && i10 < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                j[] jVarArr = (j[]) spanned.getSpans(i10, i10 + 1, j.class);
                if (jVarArr.length > 0) {
                    return spanned.getSpanEnd(jVarArr[0]);
                }
            }
            return ((d) k(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new d(i10))).f4413c;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(CharSequence charSequence, int i10) {
        if (i10 >= 0 && i10 < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                j[] jVarArr = (j[]) spanned.getSpans(i10, i10 + 1, j.class);
                if (jVarArr.length > 0) {
                    return spanned.getSpanStart(jVarArr[0]);
                }
            }
            return ((d) k(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new d(i10))).f4412b;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a8, code lost:
    
        ((androidx.emoji2.text.o) r11).d();
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046 A[Catch: all -> 0x00af, TryCatch #0 {all -> 0x00af, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:19:0x0037, B:21:0x003f, B:23:0x0042, B:25:0x0046, B:27:0x0052, B:28:0x0055, B:31:0x0063, B:37:0x0071, B:38:0x007d, B:40:0x0091, B:16:0x002c), top: B:54:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091 A[Catch: all -> 0x00af, TRY_LEAVE, TryCatch #0 {all -> 0x00af, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:19:0x0037, B:21:0x003f, B:23:0x0042, B:25:0x0046, B:27:0x0052, B:28:0x0055, B:31:0x0063, B:37:0x0071, B:38:0x007d, B:40:0x0091, B:16:0x002c), top: B:54:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence j(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.emoji2.text.o
            if (r0 == 0) goto La
            r1 = r11
            androidx.emoji2.text.o r1 = (androidx.emoji2.text.o) r1
            r1.a()
        La:
            java.lang.Class<androidx.emoji2.text.j> r1 = androidx.emoji2.text.j.class
            if (r0 != 0) goto L2c
            boolean r2 = r11 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> Laf
            if (r2 == 0) goto L13
            goto L2c
        L13:
            boolean r2 = r11 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> Laf
            if (r2 == 0) goto L2a
            r2 = r11
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch: java.lang.Throwable -> Laf
            int r3 = r12 + (-1)
            int r4 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r1)     // Catch: java.lang.Throwable -> Laf
            if (r2 > r13) goto L2a
            androidx.emoji2.text.t r2 = new androidx.emoji2.text.t     // Catch: java.lang.Throwable -> Laf
            r2.<init>(r11)     // Catch: java.lang.Throwable -> Laf
            goto L34
        L2a:
            r2 = 0
            goto L34
        L2c:
            androidx.emoji2.text.t r2 = new androidx.emoji2.text.t     // Catch: java.lang.Throwable -> Laf
            r3 = r11
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch: java.lang.Throwable -> Laf
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Laf
        L34:
            r3 = 0
            if (r2 == 0) goto L60
            java.lang.Object[] r4 = r2.getSpans(r12, r13, r1)     // Catch: java.lang.Throwable -> Laf
            androidx.emoji2.text.j[] r4 = (androidx.emoji2.text.j[]) r4     // Catch: java.lang.Throwable -> Laf
            if (r4 == 0) goto L60
            int r5 = r4.length     // Catch: java.lang.Throwable -> Laf
            if (r5 <= 0) goto L60
            int r5 = r4.length     // Catch: java.lang.Throwable -> Laf
            r6 = 0
        L44:
            if (r6 >= r5) goto L60
            r7 = r4[r6]     // Catch: java.lang.Throwable -> Laf
            int r8 = r2.getSpanStart(r7)     // Catch: java.lang.Throwable -> Laf
            int r9 = r2.getSpanEnd(r7)     // Catch: java.lang.Throwable -> Laf
            if (r8 == r13) goto L55
            r2.removeSpan(r7)     // Catch: java.lang.Throwable -> Laf
        L55:
            int r12 = java.lang.Math.min(r8, r12)     // Catch: java.lang.Throwable -> Laf
            int r13 = java.lang.Math.max(r9, r13)     // Catch: java.lang.Throwable -> Laf
            int r6 = r6 + 1
            goto L44
        L60:
            r4 = r13
            if (r12 == r4) goto La6
            int r13 = r11.length()     // Catch: java.lang.Throwable -> Laf
            if (r12 < r13) goto L6a
            goto La6
        L6a:
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r13) goto L7d
            if (r2 == 0) goto L7d
            int r13 = r2.length()     // Catch: java.lang.Throwable -> Laf
            java.lang.Object[] r13 = r2.getSpans(r3, r13, r1)     // Catch: java.lang.Throwable -> Laf
            androidx.emoji2.text.j[] r13 = (androidx.emoji2.text.j[]) r13     // Catch: java.lang.Throwable -> Laf
            int r13 = r13.length     // Catch: java.lang.Throwable -> Laf
            int r14 = r14 - r13
        L7d:
            r5 = r14
            androidx.emoji2.text.i$b r7 = new androidx.emoji2.text.i$b     // Catch: java.lang.Throwable -> Laf
            androidx.emoji2.text.f$j r13 = r10.f4404a     // Catch: java.lang.Throwable -> Laf
            r7.<init>(r2, r13)     // Catch: java.lang.Throwable -> Laf
            r1 = r10
            r2 = r11
            r3 = r12
            r6 = r15
            java.lang.Object r12 = r1.k(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Laf
            androidx.emoji2.text.t r12 = (androidx.emoji2.text.t) r12     // Catch: java.lang.Throwable -> Laf
            if (r12 == 0) goto L9d
            android.text.Spannable r12 = r12.b()     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto L9c
            androidx.emoji2.text.o r11 = (androidx.emoji2.text.o) r11
            r11.d()
        L9c:
            return r12
        L9d:
            if (r0 == 0) goto La5
            r12 = r11
            androidx.emoji2.text.o r12 = (androidx.emoji2.text.o) r12
            r12.d()
        La5:
            return r11
        La6:
            if (r0 == 0) goto Lae
            r12 = r11
            androidx.emoji2.text.o r12 = (androidx.emoji2.text.o) r12
            r12.d()
        Lae:
            return r11
        Laf:
            r12 = move-exception
            if (r0 == 0) goto Lb7
            androidx.emoji2.text.o r11 = (androidx.emoji2.text.o) r11
            r11.d()
        Lb7:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.i.j(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmojiProcessor.java */
    /* loaded from: classes.dex */
    public static class d implements c<d> {

        /* renamed from: a  reason: collision with root package name */
        private final int f4411a;

        /* renamed from: b  reason: collision with root package name */
        public int f4412b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f4413c = -1;

        d(int i10) {
            this.f4411a = i10;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean b(CharSequence charSequence, int i10, int i11, p pVar) {
            int i12 = this.f4411a;
            if (i10 <= i12 && i12 < i11) {
                this.f4412b = i10;
                this.f4413c = i11;
                return false;
            } else if (i11 > i12) {
                return false;
            } else {
                return true;
            }
        }

        @Override // androidx.emoji2.text.i.c
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public d a() {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmojiProcessor.java */
    /* loaded from: classes.dex */
    public static class e implements c<e> {

        /* renamed from: a  reason: collision with root package name */
        private final String f4414a;

        e(String str) {
            this.f4414a = str;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean b(CharSequence charSequence, int i10, int i11, p pVar) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f4414a)) {
                return true;
            }
            pVar.l(true);
            return false;
        }

        @Override // androidx.emoji2.text.i.c
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public e a() {
            return this;
        }
    }
}
