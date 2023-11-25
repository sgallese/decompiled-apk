package okhttp3.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import ec.b0;
import ec.h0;
import ec.n0;
import ec.p;
import ec.t;
import ec.u;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import nc.b;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import okio.Source;
import okio.e;
import okio.f;
import okio.o0;
import okio.y0;
import pc.a;
import pc.l;
import qc.c;
import qc.j0;
import qc.k0;
import qc.o;
import qc.q;
import yc.d;
import yc.j;
import yc.v;
import yc.w;

/* compiled from: Util.kt */
/* loaded from: classes4.dex */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Headers EMPTY_HEADERS = Headers.Companion.of(new String[0]);
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    private static final o0 UNICODE_BOMS;
    public static final TimeZone UTC;
    private static final j VERIFY_AS_IP_ADDRESS;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;
    public static final String userAgent = "okhttp/4.11.0";

    static {
        String n02;
        String o02;
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        o0.a aVar = o0.f20658q;
        f.a aVar2 = f.f20621q;
        UNICODE_BOMS = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        q.f(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new j("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        String name = OkHttpClient.class.getName();
        q.h(name, "OkHttpClient::class.java.name");
        n02 = w.n0(name, "okhttp3.");
        o02 = w.o0(n02, "Client");
        okHttpName = o02;
    }

    public static final <E> void addIfAbsent(List<E> list, E e10) {
        q.i(list, "<this>");
        if (!list.contains(e10)) {
            list.add(e10);
        }
    }

    public static final int and(byte b10, int i10) {
        return b10 & i10;
    }

    public static final EventListener.Factory asFactory(final EventListener eventListener) {
        q.i(eventListener, "<this>");
        return new EventListener.Factory() { // from class: kd.b
            @Override // okhttp3.EventListener.Factory
            public final EventListener create(Call call) {
                EventListener m366asFactory$lambda8;
                m366asFactory$lambda8 = Util.m366asFactory$lambda8(EventListener.this, call);
                return m366asFactory$lambda8;
            }
        };
    }

    /* renamed from: asFactory$lambda-8 */
    public static final EventListener m366asFactory$lambda8(EventListener eventListener, Call call) {
        q.i(eventListener, "$this_asFactory");
        q.i(call, "it");
        return eventListener;
    }

    public static final void assertThreadDoesntHoldLock(Object obj) {
        q.i(obj, "<this>");
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + obj);
        }
    }

    public static final void assertThreadHoldsLock(Object obj) {
        q.i(obj, "<this>");
        if (assertionsEnabled && !Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + obj);
        }
    }

    public static final boolean canParseAsIpAddress(String str) {
        q.i(str, "<this>");
        return VERIFY_AS_IP_ADDRESS.f(str);
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        q.i(httpUrl, "<this>");
        q.i(httpUrl2, TaskSetupFragment.TYPE_OTHER);
        if (q.d(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && q.d(httpUrl.scheme(), httpUrl2.scheme())) {
            return true;
        }
        return false;
    }

    public static final int checkDuration(String str, long j10, TimeUnit timeUnit) {
        boolean z10;
        boolean z11;
        boolean z12;
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        boolean z13 = true;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (timeUnit != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                long millis = timeUnit.toMillis(j10);
                if (millis <= 2147483647L) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (millis == 0 && j10 > 0) {
                        z13 = false;
                    }
                    if (z13) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException(q.q(str, " too small.").toString());
                }
                throw new IllegalArgumentException(q.q(str, " too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException(q.q(str, " < 0").toString());
    }

    public static final void checkOffsetAndCount(long j10, long j11, long j12) {
        if ((j11 | j12) >= 0 && j11 <= j10 && j10 - j11 >= j12) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static final void closeQuietly(Closeable closeable) {
        q.i(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String str) {
        int P;
        q.i(strArr, "<this>");
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        q.h(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        P = p.P(strArr2);
        strArr2[P] = str;
        return strArr2;
    }

    public static final int delimiterOffset(String str, String str2, int i10, int i11) {
        boolean J;
        q.i(str, "<this>");
        q.i(str2, "delimiters");
        while (i10 < i11) {
            int i12 = i10 + 1;
            J = w.J(str2, str.charAt(i10), false, 2, null);
            if (J) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return delimiterOffset(str, str2, i10, i11);
    }

    public static final boolean discard(Source source, int i10, TimeUnit timeUnit) {
        q.i(source, "<this>");
        q.i(timeUnit, "timeUnit");
        try {
            return skipAll(source, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, l<? super T, Boolean> lVar) {
        List<T> i10;
        q.i(iterable, "<this>");
        q.i(lVar, "predicate");
        i10 = t.i();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (lVar.invoke(obj).booleanValue()) {
                if (i10.isEmpty()) {
                    i10 = new ArrayList<>();
                }
                k0.c(i10).add(obj);
            }
        }
        return i10;
    }

    public static final String format(String str, Object... objArr) {
        q.i(str, "format");
        q.i(objArr, "args");
        j0 j0Var = j0.f21683a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        q.h(format, "format(locale, format, *args)");
        return format;
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        boolean z10;
        boolean z11;
        q.i(strArr, "<this>");
        q.i(comparator, "comparator");
        if (strArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && strArr2 != null) {
            if (strArr2.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                int length = strArr.length;
                int i10 = 0;
                while (i10 < length) {
                    String str = strArr[i10];
                    i10++;
                    Iterator a10 = c.a(strArr2);
                    while (a10.hasNext()) {
                        if (comparator.compare(str, (String) a10.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(Response response) {
        q.i(response, "<this>");
        String str = response.headers().get("Content-Length");
        if (str == null) {
            return -1L;
        }
        return toLongOrDefault(str, -1L);
    }

    public static final void ignoreIoExceptions(a<dc.w> aVar) {
        q.i(aVar, "block");
        try {
            aVar.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... tArr) {
        List l10;
        q.i(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        l10 = t.l(Arrays.copyOf(objArr, objArr.length));
        List<T> unmodifiableList = Collections.unmodifiableList(l10);
        q.h(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
        boolean z10;
        q.i(strArr, "<this>");
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        q.i(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], str) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        q.i(str, "<this>");
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            char charAt = str.charAt(i10);
            if (q.k(charAt, 31) > 0 && q.k(charAt, 127) < 0) {
                i10 = i11;
            } else {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        q.i(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            char charAt = str.charAt(i10);
            boolean z13 = false;
            if (charAt == '\t' || charAt == '\n') {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || charAt == '\f') {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 || charAt == '\r') {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 || charAt == ' ') {
                z13 = true;
            }
            if (z13) {
                i10 = i12;
            } else {
                return i10;
            }
        }
        return i11;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i10, i11);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        q.i(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                int i13 = i12 - 1;
                char charAt = str.charAt(i12);
                boolean z13 = false;
                if (charAt == '\t' || charAt == '\n') {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 || charAt == '\f') {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 || charAt == '\r') {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12 || charAt == ' ') {
                    z13 = true;
                }
                if (z13) {
                    if (i12 == i10) {
                        break;
                    }
                    i12 = i13;
                } else {
                    return i12 + 1;
                }
            }
        }
        return i10;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i10, i11);
    }

    public static final int indexOfNonWhitespace(String str, int i10) {
        q.i(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            int i11 = i10 + 1;
            char charAt = str.charAt(i10);
            if (charAt != ' ' && charAt != '\t') {
                return i10;
            }
            i10 = i11;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return indexOfNonWhitespace(str, i10);
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        q.i(strArr, "<this>");
        q.i(strArr2, TaskSetupFragment.TYPE_OTHER);
        q.i(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str = strArr[i10];
            i10++;
            int length2 = strArr2.length;
            int i11 = 0;
            while (true) {
                if (i11 < length2) {
                    String str2 = strArr2[i11];
                    i11++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayList.add(str);
                        break;
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean isCivilized(FileSystem fileSystem, File file) {
        q.i(fileSystem, "<this>");
        q.i(file, "file");
        y0 sink = fileSystem.sink(file);
        try {
            try {
                fileSystem.delete(file);
                b.a(sink, null);
                return true;
            } catch (IOException unused) {
                dc.w wVar = dc.w.f13270a;
                b.a(sink, null);
                fileSystem.delete(file);
                return false;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                b.a(sink, th);
                throw th2;
            }
        }
    }

    public static final boolean isHealthy(Socket socket, e eVar) {
        q.i(socket, "<this>");
        q.i(eVar, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z10 = !eVar.C();
                socket.setSoTimeout(soTimeout);
                return z10;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean isSensitiveHeader(String str) {
        boolean r10;
        boolean r11;
        boolean r12;
        boolean r13;
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        r10 = v.r(str, "Authorization", true);
        if (!r10) {
            r11 = v.r(str, "Cookie", true);
            if (!r11) {
                r12 = v.r(str, "Proxy-Authorization", true);
                if (!r12) {
                    r13 = v.r(str, "Set-Cookie", true);
                    if (r13) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static final void notify(Object obj) {
        q.i(obj, "<this>");
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        q.i(obj, "<this>");
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c10) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if ('0' <= c10 && c10 < ':') {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return c10 - '0';
        }
        char c11 = 'a';
        if ('a' <= c10 && c10 < 'g') {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            c11 = 'A';
            if ('A' > c10 || c10 >= 'G') {
                z12 = false;
            }
            if (!z12) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static final String peerName(Socket socket) {
        q.i(socket, "<this>");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (remoteSocketAddress instanceof InetSocketAddress) {
            String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
            q.h(hostName, "address.hostName");
            return hostName;
        }
        return remoteSocketAddress.toString();
    }

    public static final Charset readBomAsCharset(e eVar, Charset charset) throws IOException {
        q.i(eVar, "<this>");
        q.i(charset, "default");
        int W0 = eVar.W0(UNICODE_BOMS);
        if (W0 != -1) {
            if (W0 != 0) {
                if (W0 != 1) {
                    if (W0 != 2) {
                        if (W0 != 3) {
                            if (W0 == 4) {
                                return d.f26302a.b();
                            }
                            throw new AssertionError();
                        }
                        return d.f26302a.a();
                    }
                    Charset charset2 = StandardCharsets.UTF_16LE;
                    q.h(charset2, "UTF_16LE");
                    return charset2;
                }
                Charset charset3 = StandardCharsets.UTF_16BE;
                q.h(charset3, "UTF_16BE");
                return charset3;
            }
            Charset charset4 = StandardCharsets.UTF_8;
            q.h(charset4, "UTF_8");
            return charset4;
        }
        return charset;
    }

    public static final <T> T readFieldOrNull(Object obj, Class<T> cls, String str) {
        T t10;
        Object readFieldOrNull;
        q.i(obj, "instance");
        q.i(cls, "fieldType");
        q.i(str, "fieldName");
        Class<?> cls2 = obj.getClass();
        while (true) {
            t10 = null;
            if (!q.d(cls2, Object.class)) {
                try {
                    Field declaredField = cls2.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (!cls.isInstance(obj2)) {
                        break;
                    }
                    t10 = cls.cast(obj2);
                    break;
                } catch (NoSuchFieldException unused) {
                    cls2 = cls2.getSuperclass();
                    q.h(cls2, "c.superclass");
                }
            } else if (q.d(str, "delegate") || (readFieldOrNull = readFieldOrNull(obj, Object.class, "delegate")) == null) {
                return null;
            } else {
                return (T) readFieldOrNull(readFieldOrNull, cls, str);
            }
        }
        return t10;
    }

    public static final int readMedium(e eVar) throws IOException {
        q.i(eVar, "<this>");
        return and(eVar.readByte(), 255) | (and(eVar.readByte(), 255) << 16) | (and(eVar.readByte(), 255) << 8);
    }

    public static final boolean skipAll(Source source, int i10, TimeUnit timeUnit) throws IOException {
        q.i(source, "<this>");
        q.i(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = source.timeout().hasDeadline() ? source.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        source.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos(i10)) + nanoTime);
        try {
            okio.c cVar = new okio.c();
            while (source.read(cVar, 8192L) != -1) {
                cVar.b();
            }
            if (deadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return false;
        } catch (Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    public static final ThreadFactory threadFactory(final String str, final boolean z10) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return new ThreadFactory() { // from class: kd.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread m367threadFactory$lambda1;
                m367threadFactory$lambda1 = Util.m367threadFactory$lambda1(str, z10, runnable);
                return m367threadFactory$lambda1;
            }
        };
    }

    /* renamed from: threadFactory$lambda-1 */
    public static final Thread m367threadFactory$lambda1(String str, boolean z10, Runnable runnable) {
        q.i(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z10);
        return thread;
    }

    public static final void threadName(String str, a<dc.w> aVar) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        q.i(aVar, "block");
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            aVar.invoke();
        } finally {
            o.b(1);
            currentThread.setName(name);
            o.a(1);
        }
    }

    public static final List<Header> toHeaderList(Headers headers) {
        vc.f s10;
        int s11;
        q.i(headers, "<this>");
        s10 = vc.l.s(0, headers.size());
        s11 = u.s(s10, 10);
        ArrayList arrayList = new ArrayList(s11);
        Iterator<Integer> it = s10.iterator();
        while (it.hasNext()) {
            int a10 = ((h0) it).a();
            arrayList.add(new Header(headers.name(a10), headers.value(a10)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> list) {
        q.i(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.component1().I(), header.component2().I());
        }
        return builder.build();
    }

    public static final String toHexString(long j10) {
        String hexString = Long.toHexString(j10);
        q.h(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z10) {
        boolean K;
        String host;
        q.i(httpUrl, "<this>");
        K = w.K(httpUrl.host(), ":", false, 2, null);
        if (K) {
            host = '[' + httpUrl.host() + ']';
        } else {
            host = httpUrl.host();
        }
        if (z10 || httpUrl.port() != HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return host + ':' + httpUrl.port();
        }
        return host;
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return toHostHeader(httpUrl, z10);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        List F0;
        q.i(list, "<this>");
        F0 = b0.F0(list);
        List<T> unmodifiableList = Collections.unmodifiableList(F0);
        q.h(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        Map<K, V> h10;
        q.i(map, "<this>");
        if (map.isEmpty()) {
            h10 = n0.h();
            return h10;
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        q.h(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    public static final long toLongOrDefault(String str, long j10) {
        q.i(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int toNonNegativeInt(String str, int i10) {
        Long valueOf;
        if (str == null) {
            valueOf = null;
        } else {
            try {
                valueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i10;
            }
        }
        if (valueOf == null) {
            return i10;
        }
        long longValue = valueOf.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final String trimSubstring(String str, int i10, int i11) {
        q.i(str, "<this>");
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i10, i11);
        String substring = str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, indexOfFirstNonAsciiWhitespace, i11));
        q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return trimSubstring(str, i10, i11);
    }

    public static final void wait(Object obj) {
        q.i(obj, "<this>");
        obj.wait();
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> list) {
        q.i(exc, "<this>");
        q.i(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            dc.b.a(exc, it.next());
        }
        return exc;
    }

    public static final void writeMedium(okio.d dVar, int i10) throws IOException {
        q.i(dVar, "<this>");
        dVar.D((i10 >>> 16) & 255);
        dVar.D((i10 >>> 8) & 255);
        dVar.D(i10 & 255);
    }

    public static final int and(short s10, int i10) {
        return s10 & i10;
    }

    public static final int delimiterOffset(String str, char c10, int i10, int i11) {
        q.i(str, "<this>");
        while (i10 < i11) {
            int i12 = i10 + 1;
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10 = i12;
        }
        return i11;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return delimiterOffset(str, c10, i10, i11);
    }

    public static final String toHexString(int i10) {
        String hexString = Integer.toHexString(i10);
        q.h(hexString, "toHexString(this)");
        return hexString;
    }

    public static final long and(int i10, long j10) {
        return i10 & j10;
    }

    public static final void closeQuietly(Socket socket) {
        q.i(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!q.d(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        q.i(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(okio.c cVar, byte b10) {
        q.i(cVar, "<this>");
        int i10 = 0;
        while (!cVar.C() && cVar.B(0L) == b10) {
            i10++;
            cVar.readByte();
        }
        return i10;
    }
}
