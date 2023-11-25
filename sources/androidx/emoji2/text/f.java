package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: EmojiCompat.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: o  reason: collision with root package name */
    private static final Object f4367o = new Object();

    /* renamed from: p  reason: collision with root package name */
    private static final Object f4368p = new Object();

    /* renamed from: q  reason: collision with root package name */
    private static volatile f f4369q;

    /* renamed from: b  reason: collision with root package name */
    private final Set<AbstractC0088f> f4371b;

    /* renamed from: e  reason: collision with root package name */
    private final b f4374e;

    /* renamed from: f  reason: collision with root package name */
    final h f4375f;

    /* renamed from: g  reason: collision with root package name */
    private final j f4376g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f4377h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f4378i;

    /* renamed from: j  reason: collision with root package name */
    final int[] f4379j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f4380k;

    /* renamed from: l  reason: collision with root package name */
    private final int f4381l;

    /* renamed from: m  reason: collision with root package name */
    private final int f4382m;

    /* renamed from: n  reason: collision with root package name */
    private final e f4383n;

    /* renamed from: a  reason: collision with root package name */
    private final ReadWriteLock f4370a = new ReentrantReadWriteLock();

    /* renamed from: c  reason: collision with root package name */
    private volatile int f4372c = 3;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f4373d = new Handler(Looper.getMainLooper());

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    private static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        private volatile androidx.emoji2.text.i f4384b;

        /* renamed from: c  reason: collision with root package name */
        private volatile n f4385c;

        /* compiled from: EmojiCompat.java */
        /* renamed from: androidx.emoji2.text.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0087a extends i {
            C0087a() {
            }

            @Override // androidx.emoji2.text.f.i
            public void a(Throwable th) {
                a.this.f4387a.p(th);
            }

            @Override // androidx.emoji2.text.f.i
            public void b(n nVar) {
                a.this.f(nVar);
            }
        }

        a(f fVar) {
            super(fVar);
        }

        @Override // androidx.emoji2.text.f.b
        int a(CharSequence charSequence, int i10) {
            return this.f4384b.b(charSequence, i10);
        }

        @Override // androidx.emoji2.text.f.b
        int b(CharSequence charSequence, int i10) {
            return this.f4384b.c(charSequence, i10);
        }

        @Override // androidx.emoji2.text.f.b
        void c() {
            try {
                this.f4387a.f4375f.a(new C0087a());
            } catch (Throwable th) {
                this.f4387a.p(th);
            }
        }

        @Override // androidx.emoji2.text.f.b
        CharSequence d(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f4384b.j(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.f.b
        void e(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f4385c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f4387a.f4377h);
        }

        void f(n nVar) {
            if (nVar == null) {
                this.f4387a.p(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f4385c = nVar;
            n nVar2 = this.f4385c;
            j jVar = this.f4387a.f4376g;
            e eVar = this.f4387a.f4383n;
            f fVar = this.f4387a;
            this.f4384b = new androidx.emoji2.text.i(nVar2, jVar, eVar, fVar.f4378i, fVar.f4379j, androidx.emoji2.text.h.a());
            this.f4387a.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final f f4387a;

        b(f fVar) {
            this.f4387a = fVar;
        }

        int a(CharSequence charSequence, int i10) {
            throw null;
        }

        int b(CharSequence charSequence, int i10) {
            throw null;
        }

        void c() {
            throw null;
        }

        CharSequence d(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            throw null;
        }

        void e(EditorInfo editorInfo) {
            throw null;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final h f4388a;

        /* renamed from: b  reason: collision with root package name */
        j f4389b;

        /* renamed from: c  reason: collision with root package name */
        boolean f4390c;

        /* renamed from: d  reason: collision with root package name */
        boolean f4391d;

        /* renamed from: e  reason: collision with root package name */
        int[] f4392e;

        /* renamed from: f  reason: collision with root package name */
        Set<AbstractC0088f> f4393f;

        /* renamed from: g  reason: collision with root package name */
        boolean f4394g;

        /* renamed from: h  reason: collision with root package name */
        int f4395h = -16711936;

        /* renamed from: i  reason: collision with root package name */
        int f4396i = 0;

        /* renamed from: j  reason: collision with root package name */
        e f4397j = new androidx.emoji2.text.e();

        /* JADX INFO: Access modifiers changed from: protected */
        public c(h hVar) {
            androidx.core.util.i.h(hVar, "metadataLoader cannot be null.");
            this.f4388a = hVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final h a() {
            return this.f4388a;
        }

        public c b(int i10) {
            this.f4396i = i10;
            return this;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class d implements j {
        @Override // androidx.emoji2.text.f.j
        public androidx.emoji2.text.j a(p pVar) {
            return new q(pVar);
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public interface e {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static class g implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        private final List<AbstractC0088f> f4398f;

        /* renamed from: m  reason: collision with root package name */
        private final Throwable f4399m;

        /* renamed from: p  reason: collision with root package name */
        private final int f4400p;

        g(AbstractC0088f abstractC0088f, int i10) {
            this(Arrays.asList((AbstractC0088f) androidx.core.util.i.h(abstractC0088f, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f4398f.size();
            int i10 = 0;
            if (this.f4400p != 1) {
                while (i10 < size) {
                    this.f4398f.get(i10).a(this.f4399m);
                    i10++;
                }
                return;
            }
            while (i10 < size) {
                this.f4398f.get(i10).b();
                i10++;
            }
        }

        g(Collection<AbstractC0088f> collection, int i10) {
            this(collection, i10, null);
        }

        g(Collection<AbstractC0088f> collection, int i10, Throwable th) {
            androidx.core.util.i.h(collection, "initCallbacks cannot be null");
            this.f4398f = new ArrayList(collection);
            this.f4400p = i10;
            this.f4399m = th;
        }
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public interface h {
        void a(i iVar);
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(n nVar);
    }

    /* compiled from: EmojiCompat.java */
    /* loaded from: classes.dex */
    public interface j {
        androidx.emoji2.text.j a(p pVar);
    }

    private f(c cVar) {
        this.f4377h = cVar.f4390c;
        this.f4378i = cVar.f4391d;
        this.f4379j = cVar.f4392e;
        this.f4380k = cVar.f4394g;
        this.f4381l = cVar.f4395h;
        this.f4375f = cVar.f4388a;
        this.f4382m = cVar.f4396i;
        this.f4383n = cVar.f4397j;
        androidx.collection.b bVar = new androidx.collection.b();
        this.f4371b = bVar;
        j jVar = cVar.f4389b;
        this.f4376g = jVar == null ? new d() : jVar;
        Set<AbstractC0088f> set = cVar.f4393f;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f4393f);
        }
        this.f4374e = new a(this);
        o();
    }

    public static f c() {
        f fVar;
        boolean z10;
        synchronized (f4367o) {
            fVar = f4369q;
            if (fVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            androidx.core.util.i.i(z10, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return fVar;
    }

    public static boolean h(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return androidx.emoji2.text.i.d(inputConnection, editable, i10, i11, z10);
    }

    public static boolean i(Editable editable, int i10, KeyEvent keyEvent) {
        return androidx.emoji2.text.i.e(editable, i10, keyEvent);
    }

    public static f j(c cVar) {
        f fVar = f4369q;
        if (fVar == null) {
            synchronized (f4367o) {
                fVar = f4369q;
                if (fVar == null) {
                    fVar = new f(cVar);
                    f4369q = fVar;
                }
            }
        }
        return fVar;
    }

    public static boolean k() {
        if (f4369q != null) {
            return true;
        }
        return false;
    }

    private boolean m() {
        if (g() == 1) {
            return true;
        }
        return false;
    }

    private void o() {
        this.f4370a.writeLock().lock();
        try {
            if (this.f4382m == 0) {
                this.f4372c = 0;
            }
            this.f4370a.writeLock().unlock();
            if (g() == 0) {
                this.f4374e.c();
            }
        } catch (Throwable th) {
            this.f4370a.writeLock().unlock();
            throw th;
        }
    }

    public int d(CharSequence charSequence, int i10) {
        androidx.core.util.i.i(m(), "Not initialized yet");
        androidx.core.util.i.h(charSequence, "charSequence cannot be null");
        return this.f4374e.a(charSequence, i10);
    }

    public int e() {
        return this.f4381l;
    }

    public int f(CharSequence charSequence, int i10) {
        androidx.core.util.i.i(m(), "Not initialized yet");
        androidx.core.util.i.h(charSequence, "charSequence cannot be null");
        return this.f4374e.b(charSequence, i10);
    }

    public int g() {
        this.f4370a.readLock().lock();
        try {
            return this.f4372c;
        } finally {
            this.f4370a.readLock().unlock();
        }
    }

    public boolean l() {
        return this.f4380k;
    }

    public void n() {
        boolean z10 = true;
        if (this.f4382m != 1) {
            z10 = false;
        }
        androidx.core.util.i.i(z10, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m()) {
            return;
        }
        this.f4370a.writeLock().lock();
        try {
            if (this.f4372c == 0) {
                return;
            }
            this.f4372c = 0;
            this.f4370a.writeLock().unlock();
            this.f4374e.c();
        } finally {
            this.f4370a.writeLock().unlock();
        }
    }

    void p(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f4370a.writeLock().lock();
        try {
            this.f4372c = 2;
            arrayList.addAll(this.f4371b);
            this.f4371b.clear();
            this.f4370a.writeLock().unlock();
            this.f4373d.post(new g(arrayList, this.f4372c, th));
        } catch (Throwable th2) {
            this.f4370a.writeLock().unlock();
            throw th2;
        }
    }

    void q() {
        ArrayList arrayList = new ArrayList();
        this.f4370a.writeLock().lock();
        try {
            this.f4372c = 1;
            arrayList.addAll(this.f4371b);
            this.f4371b.clear();
            this.f4370a.writeLock().unlock();
            this.f4373d.post(new g(arrayList, this.f4372c));
        } catch (Throwable th) {
            this.f4370a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence r(CharSequence charSequence) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        return s(charSequence, 0, length);
    }

    public CharSequence s(CharSequence charSequence, int i10, int i11) {
        return t(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    public CharSequence t(CharSequence charSequence, int i10, int i11, int i12) {
        return u(charSequence, i10, i11, i12, 0);
    }

    public CharSequence u(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        androidx.core.util.i.i(m(), "Not initialized yet");
        androidx.core.util.i.e(i10, "start cannot be negative");
        androidx.core.util.i.e(i11, "end cannot be negative");
        androidx.core.util.i.e(i12, "maxEmojiCount cannot be negative");
        if (i10 <= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        androidx.core.util.i.b(z10, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        if (i10 <= charSequence.length()) {
            z11 = true;
        } else {
            z11 = false;
        }
        androidx.core.util.i.b(z11, "start should be < than charSequence length");
        if (i11 <= charSequence.length()) {
            z12 = true;
        } else {
            z12 = false;
        }
        androidx.core.util.i.b(z12, "end should be < than charSequence length");
        if (charSequence.length() != 0 && i10 != i11) {
            if (i13 != 1) {
                if (i13 != 2) {
                    z13 = this.f4377h;
                } else {
                    z13 = false;
                }
            } else {
                z13 = true;
            }
            return this.f4374e.d(charSequence, i10, i11, i12, z13);
        }
        return charSequence;
    }

    public void v(AbstractC0088f abstractC0088f) {
        androidx.core.util.i.h(abstractC0088f, "initCallback cannot be null");
        this.f4370a.writeLock().lock();
        try {
            if (this.f4372c != 1 && this.f4372c != 2) {
                this.f4371b.add(abstractC0088f);
            }
            this.f4373d.post(new g(abstractC0088f, this.f4372c));
        } finally {
            this.f4370a.writeLock().unlock();
        }
    }

    public void w(AbstractC0088f abstractC0088f) {
        androidx.core.util.i.h(abstractC0088f, "initCallback cannot be null");
        this.f4370a.writeLock().lock();
        try {
            this.f4371b.remove(abstractC0088f);
        } finally {
            this.f4370a.writeLock().unlock();
        }
    }

    public void x(EditorInfo editorInfo) {
        if (m() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f4374e.e(editorInfo);
        }
    }

    /* compiled from: EmojiCompat.java */
    /* renamed from: androidx.emoji2.text.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0088f {
        public void b() {
        }

        public void a(Throwable th) {
        }
    }
}
