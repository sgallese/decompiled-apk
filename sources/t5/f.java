package t5;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import org.json.JSONArray;
import yc.v;
import yc.w;

/* compiled from: EventsFileManager.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: e  reason: collision with root package name */
    public static final a f23647e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final jd.a f23648f = jd.c.b(false, 1, null);

    /* renamed from: g  reason: collision with root package name */
    private static final jd.a f23649g = jd.c.b(false, 1, null);

    /* renamed from: h  reason: collision with root package name */
    private static final Set<String> f23650h;

    /* renamed from: i  reason: collision with root package name */
    private static final Map<String, File> f23651i;

    /* renamed from: a  reason: collision with root package name */
    private final File f23652a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23653b;

    /* renamed from: c  reason: collision with root package name */
    private final w5.b f23654c;

    /* renamed from: d  reason: collision with root package name */
    private final String f23655d;

    /* compiled from: EventsFileManager.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EventsFileManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.amplitude.core.utilities.EventsFileManager", f = "EventsFileManager.kt", l = {193}, m = "getEventString")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f23656f;

        /* renamed from: m  reason: collision with root package name */
        Object f23657m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f23658p;

        /* renamed from: r  reason: collision with root package name */
        int f23660r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23658p = obj;
            this.f23660r |= RecyclerView.UNDEFINED_DURATION;
            return f.this.f(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EventsFileManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.amplitude.core.utilities.EventsFileManager", f = "EventsFileManager.kt", l = {193}, m = "rollover")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f23661f;

        /* renamed from: m  reason: collision with root package name */
        Object f23662m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f23663p;

        /* renamed from: r  reason: collision with root package name */
        int f23665r;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23663p = obj;
            this.f23665r |= RecyclerView.UNDEFINED_DURATION;
            return f.this.l(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EventsFileManager.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.amplitude.core.utilities.EventsFileManager", f = "EventsFileManager.kt", l = {193}, m = "storeEvent")
    /* loaded from: classes.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f23666f;

        /* renamed from: m  reason: collision with root package name */
        Object f23667m;

        /* renamed from: p  reason: collision with root package name */
        Object f23668p;

        /* renamed from: q  reason: collision with root package name */
        /* synthetic */ Object f23669q;

        /* renamed from: s  reason: collision with root package name */
        int f23671s;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23669q = obj;
            this.f23671s |= RecyclerView.UNDEFINED_DURATION;
            return f.this.o(null, this);
        }
    }

    static {
        Set<String> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        qc.q.h(newSetFromMap, "newSetFromMap(Concurrent…shMap<String, Boolean>())");
        f23650h = newSetFromMap;
        f23651i = new ConcurrentHashMap();
    }

    public f(File file, String str, w5.b bVar) {
        qc.q.i(file, "directory");
        qc.q.i(str, "apiKey");
        qc.q.i(bVar, "kvs");
        this.f23652a = file;
        this.f23653b = str;
        this.f23654c = bVar;
        w5.a.a(file);
        this.f23655d = qc.q.q("amplitude.events.file.index.", str);
    }

    private final File c() {
        Object Q;
        Map<String, File> map = f23651i;
        File file = map.get(this.f23653b);
        if (file == null) {
            File[] listFiles = this.f23652a.listFiles(new FilenameFilter() { // from class: t5.d
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    boolean d10;
                    d10 = f.d(f.this, file2, str);
                    return d10;
                }
            });
            if (listFiles == null) {
                listFiles = new File[0];
            }
            Q = ec.p.Q(listFiles, 0);
            file = (File) Q;
        }
        long a10 = this.f23654c.a(this.f23655d, 0L);
        String str = this.f23653b;
        if (file == null) {
            file = new File(this.f23652a, this.f23653b + '-' + a10 + ".tmp");
        }
        map.put(str, file);
        File file2 = map.get(this.f23653b);
        qc.q.f(file2);
        return file2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(f fVar, File file, String str) {
        boolean K;
        boolean q10;
        qc.q.i(fVar, "$this_run");
        qc.q.h(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        K = w.K(str, fVar.f23653b, false, 2, null);
        if (K) {
            q10 = v.q(str, ".tmp", false, 2, null);
            if (!q10) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final void e(File file) {
        String d10;
        if (file != null && file.exists() && file.length() != 0) {
            byte[] bytes = "]".getBytes(yc.d.f26303b);
            qc.q.h(bytes, "(this as java.lang.String).getBytes(charset)");
            q(bytes, file);
            File file2 = this.f23652a;
            d10 = nc.g.d(file);
            file.renameTo(new File(file2, d10));
            g();
            k();
        }
    }

    private final boolean g() {
        return this.f23654c.b(this.f23655d, this.f23654c.a(this.f23655d, 0L) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(f fVar, File file, String str) {
        boolean K;
        boolean q10;
        qc.q.i(fVar, "this$0");
        qc.q.h(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        K = w.K(str, fVar.f23653b, false, 2, null);
        if (K) {
            q10 = v.q(str, ".tmp", false, 2, null);
            if (q10) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final void k() {
        f23651i.remove(this.f23653b);
    }

    private final void n(File file) {
        byte[] bytes = "[".getBytes(yc.d.f26303b);
        qc.q.h(bytes, "(this as java.lang.String).getBytes(charset)");
        q(bytes, file);
    }

    private final void p(String str, File file) {
        String d10;
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            Charset charset = yc.d.f26303b;
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                qc.q.h(bytes, "(this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.flush();
                dc.w wVar = dc.w.f13270a;
                nc.b.a(fileOutputStream, null);
                File file2 = this.f23652a;
                d10 = nc.g.d(file);
                file.renameTo(new File(file2, d10));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                nc.b.a(fileOutputStream, th);
                throw th2;
            }
        }
    }

    private final void q(byte[] bArr, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            dc.w wVar = dc.w.f13270a;
            nc.b.a(fileOutputStream, null);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[Catch: all -> 0x0094, TRY_LEAVE, TryCatch #0 {all -> 0x0094, blocks: (B:17:0x004e, B:19:0x0056, B:22:0x005f, B:24:0x0077, B:28:0x0086, B:34:0x0090, B:35:0x0093, B:25:0x007a, B:27:0x0082, B:32:0x008e), top: B:39:0x004e, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[Catch: all -> 0x0094, TRY_ENTER, TryCatch #0 {all -> 0x0094, blocks: (B:17:0x004e, B:19:0x0056, B:22:0x005f, B:24:0x0077, B:28:0x0086, B:34:0x0090, B:35:0x0093, B:25:0x007a, B:27:0x0082, B:32:0x008e), top: B:39:0x004e, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r6, kotlin.coroutines.Continuation<? super java.lang.String> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof t5.f.b
            if (r0 == 0) goto L13
            r0 = r7
            t5.f$b r0 = (t5.f.b) r0
            int r1 = r0.f23660r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23660r = r1
            goto L18
        L13:
            t5.f$b r0 = new t5.f$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f23658p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f23660r
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f23657m
            jd.a r6 = (jd.a) r6
            java.lang.Object r0 = r0.f23656f
            java.lang.String r0 = (java.lang.String) r0
            dc.n.b(r7)
            r7 = r6
            r6 = r0
            goto L4e
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            dc.n.b(r7)
            jd.a r7 = t5.f.f23649g
            r0.f23656f = r6
            r0.f23657m = r7
            r0.f23660r = r3
            java.lang.Object r0 = r7.c(r4, r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            java.util.Set<java.lang.String> r0 = t5.f.f23650h     // Catch: java.lang.Throwable -> L94
            boolean r1 = r0.contains(r6)     // Catch: java.lang.Throwable -> L94
            if (r1 == 0) goto L5f
            r0.remove(r6)     // Catch: java.lang.Throwable -> L94
            java.lang.String r6 = ""
            r7.d(r4)
            return r6
        L5f:
            r0.add(r6)     // Catch: java.lang.Throwable -> L94
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L94
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L94
            java.nio.charset.Charset r6 = yc.d.f26303b     // Catch: java.lang.Throwable -> L94
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L94
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L94
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L94
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> L94
            boolean r6 = r0 instanceof java.io.BufferedReader     // Catch: java.lang.Throwable -> L94
            if (r6 == 0) goto L7a
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0     // Catch: java.lang.Throwable -> L94
            goto L82
        L7a:
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L94
            r1 = 8192(0x2000, float:1.14794E-41)
            r6.<init>(r0, r1)     // Catch: java.lang.Throwable -> L94
            r0 = r6
        L82:
            java.lang.String r6 = nc.h.c(r0)     // Catch: java.lang.Throwable -> L8d
            nc.b.a(r0, r4)     // Catch: java.lang.Throwable -> L94
            r7.d(r4)
            return r6
        L8d:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L8f
        L8f:
            r1 = move-exception
            nc.b.a(r0, r6)     // Catch: java.lang.Throwable -> L94
            throw r1     // Catch: java.lang.Throwable -> L94
        L94:
            r6 = move-exception
            r7.d(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.f.f(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final List<String> h() {
        File[] listFiles = this.f23652a.listFiles(new FilenameFilter() { // from class: t5.e
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean i10;
                i10 = f.i(f.this, file, str);
                return i10;
            }
        });
        if (listFiles == null) {
            listFiles = new File[0];
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file : listFiles) {
            arrayList.add(file.getAbsolutePath());
        }
        return arrayList;
    }

    public final boolean j(String str) {
        qc.q.i(str, "filePath");
        f23650h.remove(str);
        return new File(str).delete();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.coroutines.Continuation<? super dc.w> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof t5.f.c
            if (r0 == 0) goto L13
            r0 = r9
            t5.f$c r0 = (t5.f.c) r0
            int r1 = r0.f23665r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23665r = r1
            goto L18
        L13:
            t5.f$c r0 = new t5.f$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f23663p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f23665r
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r1 = r0.f23662m
            jd.a r1 = (jd.a) r1
            java.lang.Object r0 = r0.f23661f
            t5.f r0 = (t5.f) r0
            dc.n.b(r9)
            goto L4e
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            dc.n.b(r9)
            jd.a r9 = t5.f.f23648f
            r0.f23661f = r8
            r0.f23662m = r9
            r0.f23665r = r4
            java.lang.Object r0 = r9.c(r3, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r8
            r1 = r9
        L4e:
            java.io.File r9 = r0.c()     // Catch: java.lang.Throwable -> L6d
            boolean r2 = r9.exists()     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L65
            long r4 = r9.length()     // Catch: java.lang.Throwable -> L6d
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L65
            r0.e(r9)     // Catch: java.lang.Throwable -> L6d
        L65:
            dc.w r9 = dc.w.f13270a     // Catch: java.lang.Throwable -> L6d
            r1.d(r3)
            dc.w r9 = dc.w.f13270a
            return r9
        L6d:
            r9 = move-exception
            r1.d(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.f.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void m(String str, JSONArray jSONArray) {
        qc.q.i(str, "filePath");
        qc.q.i(jSONArray, "events");
        File file = new File(str);
        if (!file.exists()) {
            return;
        }
        String name = file.getName();
        File file2 = new File(this.f23652a, qc.q.q(name, "-1.tmp"));
        File file3 = new File(this.f23652a, qc.q.q(name, "-2.tmp"));
        dc.l<String, String> d10 = o.d(jSONArray);
        p(d10.c(), file2);
        p(d10.d(), file3);
        j(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:18:0x0055, B:20:0x005f, B:21:0x0062, B:23:0x006d, B:25:0x007a, B:26:0x007e, B:28:0x008a, B:32:0x009e, B:34:0x00a6, B:37:0x00ba, B:38:0x00c1, B:29:0x008e, B:31:0x0098), top: B:42:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:18:0x0055, B:20:0x005f, B:21:0x0062, B:23:0x006d, B:25:0x007a, B:26:0x007e, B:28:0x008a, B:32:0x009e, B:34:0x00a6, B:37:0x00ba, B:38:0x00c1, B:29:0x008e, B:31:0x0098), top: B:42:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:18:0x0055, B:20:0x005f, B:21:0x0062, B:23:0x006d, B:25:0x007a, B:26:0x007e, B:28:0x008a, B:32:0x009e, B:34:0x00a6, B:37:0x00ba, B:38:0x00c1, B:29:0x008e, B:31:0x0098), top: B:42:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:18:0x0055, B:20:0x005f, B:21:0x0062, B:23:0x006d, B:25:0x007a, B:26:0x007e, B:28:0x008a, B:32:0x009e, B:34:0x00a6, B:37:0x00ba, B:38:0x00c1, B:29:0x008e, B:31:0x0098), top: B:42:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6 A[Catch: all -> 0x00c2, TRY_LEAVE, TryCatch #0 {all -> 0x00c2, blocks: (B:18:0x0055, B:20:0x005f, B:21:0x0062, B:23:0x006d, B:25:0x007a, B:26:0x007e, B:28:0x008a, B:32:0x009e, B:34:0x00a6, B:37:0x00ba, B:38:0x00c1, B:29:0x008e, B:31:0x0098), top: B:42:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba A[Catch: all -> 0x00c2, TRY_ENTER, TryCatch #0 {all -> 0x00c2, blocks: (B:18:0x0055, B:20:0x005f, B:21:0x0062, B:23:0x006d, B:25:0x007a, B:26:0x007e, B:28:0x008a, B:32:0x009e, B:34:0x00a6, B:37:0x00ba, B:38:0x00c1, B:29:0x008e, B:31:0x0098), top: B:42:0x0055 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.String r10, kotlin.coroutines.Continuation<? super dc.w> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof t5.f.d
            if (r0 == 0) goto L13
            r0 = r11
            t5.f$d r0 = (t5.f.d) r0
            int r1 = r0.f23671s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23671s = r1
            goto L18
        L13:
            t5.f$d r0 = new t5.f$d
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f23669q
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f23671s
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r10 = r0.f23668p
            jd.a r10 = (jd.a) r10
            java.lang.Object r1 = r0.f23667m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f23666f
            t5.f r0 = (t5.f) r0
            dc.n.b(r11)
            r11 = r10
            r10 = r1
            goto L55
        L38:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L40:
            dc.n.b(r11)
            jd.a r11 = t5.f.f23648f
            r0.f23666f = r9
            r0.f23667m = r10
            r0.f23668p = r11
            r0.f23671s = r4
            java.lang.Object r0 = r11.c(r3, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r9
        L55:
            java.io.File r1 = r0.c()     // Catch: java.lang.Throwable -> Lc2
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> Lc2
            if (r2 != 0) goto L62
            r1.createNewFile()     // Catch: java.lang.Throwable -> Lc2
        L62:
            long r4 = r1.length()     // Catch: java.lang.Throwable -> Lc2
            r6 = 975000(0xee098, double:4.81714E-318)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L7e
            r0.e(r1)     // Catch: java.lang.Throwable -> Lc2
            java.io.File r1 = r0.c()     // Catch: java.lang.Throwable -> Lc2
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> Lc2
            if (r2 != 0) goto L62
            r1.createNewFile()     // Catch: java.lang.Throwable -> Lc2
            goto L62
        L7e:
            java.lang.String r2 = ""
            long r4 = r1.length()     // Catch: java.lang.Throwable -> Lc2
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L8e
            r0.n(r1)     // Catch: java.lang.Throwable -> Lc2
            goto L9e
        L8e:
            long r4 = r1.length()     // Catch: java.lang.Throwable -> Lc2
            r6 = 1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L9e
            java.lang.String r4 = ","
            java.lang.String r2 = qc.q.q(r2, r4)     // Catch: java.lang.Throwable -> Lc2
        L9e:
            java.lang.String r10 = qc.q.q(r2, r10)     // Catch: java.lang.Throwable -> Lc2
            java.nio.charset.Charset r2 = yc.d.f26303b     // Catch: java.lang.Throwable -> Lc2
            if (r10 == 0) goto Lba
            byte[] r10 = r10.getBytes(r2)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = "(this as java.lang.String).getBytes(charset)"
            qc.q.h(r10, r2)     // Catch: java.lang.Throwable -> Lc2
            r0.q(r10, r1)     // Catch: java.lang.Throwable -> Lc2
            dc.w r10 = dc.w.f13270a     // Catch: java.lang.Throwable -> Lc2
            r11.d(r3)
            dc.w r10 = dc.w.f13270a
            return r10
        Lba:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r10.<init>(r0)     // Catch: java.lang.Throwable -> Lc2
            throw r10     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r10 = move-exception
            r11.d(r3)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.f.o(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
