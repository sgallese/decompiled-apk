package com.google.gson.internal.bind;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes3.dex */
public final class TypeAdapters {
    public static final com.google.gson.s<String> A;
    public static final com.google.gson.s<BigDecimal> B;
    public static final com.google.gson.s<BigInteger> C;
    public static final com.google.gson.t D;
    public static final com.google.gson.s<StringBuilder> E;
    public static final com.google.gson.t F;
    public static final com.google.gson.s<StringBuffer> G;
    public static final com.google.gson.t H;
    public static final com.google.gson.s<URL> I;
    public static final com.google.gson.t J;
    public static final com.google.gson.s<URI> K;
    public static final com.google.gson.t L;
    public static final com.google.gson.s<InetAddress> M;
    public static final com.google.gson.t N;
    public static final com.google.gson.s<UUID> O;
    public static final com.google.gson.t P;
    public static final com.google.gson.s<Currency> Q;
    public static final com.google.gson.t R;
    public static final com.google.gson.t S;
    public static final com.google.gson.s<Calendar> T;
    public static final com.google.gson.t U;
    public static final com.google.gson.s<Locale> V;
    public static final com.google.gson.t W;
    public static final com.google.gson.s<com.google.gson.l> X;
    public static final com.google.gson.t Y;
    public static final com.google.gson.t Z;

    /* renamed from: a  reason: collision with root package name */
    public static final com.google.gson.s<Class> f12187a;

    /* renamed from: b  reason: collision with root package name */
    public static final com.google.gson.t f12188b;

    /* renamed from: c  reason: collision with root package name */
    public static final com.google.gson.s<BitSet> f12189c;

    /* renamed from: d  reason: collision with root package name */
    public static final com.google.gson.t f12190d;

    /* renamed from: e  reason: collision with root package name */
    public static final com.google.gson.s<Boolean> f12191e;

    /* renamed from: f  reason: collision with root package name */
    public static final com.google.gson.s<Boolean> f12192f;

    /* renamed from: g  reason: collision with root package name */
    public static final com.google.gson.t f12193g;

    /* renamed from: h  reason: collision with root package name */
    public static final com.google.gson.s<Number> f12194h;

    /* renamed from: i  reason: collision with root package name */
    public static final com.google.gson.t f12195i;

    /* renamed from: j  reason: collision with root package name */
    public static final com.google.gson.s<Number> f12196j;

    /* renamed from: k  reason: collision with root package name */
    public static final com.google.gson.t f12197k;

    /* renamed from: l  reason: collision with root package name */
    public static final com.google.gson.s<Number> f12198l;

    /* renamed from: m  reason: collision with root package name */
    public static final com.google.gson.t f12199m;

    /* renamed from: n  reason: collision with root package name */
    public static final com.google.gson.s<AtomicInteger> f12200n;

    /* renamed from: o  reason: collision with root package name */
    public static final com.google.gson.t f12201o;

    /* renamed from: p  reason: collision with root package name */
    public static final com.google.gson.s<AtomicBoolean> f12202p;

    /* renamed from: q  reason: collision with root package name */
    public static final com.google.gson.t f12203q;

    /* renamed from: r  reason: collision with root package name */
    public static final com.google.gson.s<AtomicIntegerArray> f12204r;

    /* renamed from: s  reason: collision with root package name */
    public static final com.google.gson.t f12205s;

    /* renamed from: t  reason: collision with root package name */
    public static final com.google.gson.s<Number> f12206t;

    /* renamed from: u  reason: collision with root package name */
    public static final com.google.gson.s<Number> f12207u;

    /* renamed from: v  reason: collision with root package name */
    public static final com.google.gson.s<Number> f12208v;

    /* renamed from: w  reason: collision with root package name */
    public static final com.google.gson.s<Number> f12209w;

    /* renamed from: x  reason: collision with root package name */
    public static final com.google.gson.t f12210x;

    /* renamed from: y  reason: collision with root package name */
    public static final com.google.gson.s<Character> f12211y;

    /* renamed from: z  reason: collision with root package name */
    public static final com.google.gson.t f12212z;

    /* loaded from: classes3.dex */
    static class a extends com.google.gson.s<AtomicIntegerArray> {
        a() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray read(ja.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.b();
            while (aVar.z()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.R()));
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }
            aVar.m();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.d();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.l0(atomicIntegerArray.get(i10));
            }
            cVar.m();
        }
    }

    /* loaded from: classes3.dex */
    static class a0 extends com.google.gson.s<Number> {
        a0() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Number read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.R());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, Number number) throws IOException {
            cVar.q0(number);
        }
    }

    /* loaded from: classes3.dex */
    static class b extends com.google.gson.s<Number> {
        b() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Number read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            try {
                return Long.valueOf(aVar.T());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, Number number) throws IOException {
            cVar.q0(number);
        }
    }

    /* loaded from: classes3.dex */
    static class b0 extends com.google.gson.s<AtomicInteger> {
        b0() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public AtomicInteger read(ja.a aVar) throws IOException {
            try {
                return new AtomicInteger(aVar.R());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.l0(atomicInteger.get());
        }
    }

    /* loaded from: classes3.dex */
    static class c extends com.google.gson.s<Number> {
        c() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Number read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            return Float.valueOf((float) aVar.Q());
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, Number number) throws IOException {
            cVar.q0(number);
        }
    }

    /* loaded from: classes3.dex */
    static class c0 extends com.google.gson.s<AtomicBoolean> {
        c0() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public AtomicBoolean read(ja.a aVar) throws IOException {
            return new AtomicBoolean(aVar.L());
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.x0(atomicBoolean.get());
        }
    }

    /* loaded from: classes3.dex */
    static class d extends com.google.gson.s<Number> {
        d() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Number read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            return Double.valueOf(aVar.Q());
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, Number number) throws IOException {
            cVar.q0(number);
        }
    }

    /* loaded from: classes3.dex */
    private static final class d0<T extends Enum<T>> extends com.google.gson.s<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, T> f12229a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private final Map<T, String> f12230b = new HashMap();

        public d0(Class<T> cls) {
            try {
                for (T t10 : cls.getEnumConstants()) {
                    String name = t10.name();
                    fa.c cVar = (fa.c) cls.getField(name).getAnnotation(fa.c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.f12229a.put(str, t10);
                        }
                    }
                    this.f12229a.put(name, t10);
                    this.f12230b.put(t10, name);
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public T read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            return this.f12229a.get(aVar.i0());
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, T t10) throws IOException {
            String str;
            if (t10 == null) {
                str = null;
            } else {
                str = this.f12230b.get(t10);
            }
            cVar.s0(str);
        }
    }

    /* loaded from: classes3.dex */
    static class e extends com.google.gson.s<Number> {
        e() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Number read(ja.a aVar) throws IOException {
            ja.b l02 = aVar.l0();
            int i10 = v.f12231a[l02.ordinal()];
            if (i10 != 1 && i10 != 3) {
                if (i10 == 4) {
                    aVar.c0();
                    return null;
                }
                throw new JsonSyntaxException("Expecting number, got: " + l02);
            }
            return new ga.f(aVar.i0());
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, Number number) throws IOException {
            cVar.q0(number);
        }
    }

    /* loaded from: classes3.dex */
    static class f extends com.google.gson.s<Character> {
        f() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Character read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            String i02 = aVar.i0();
            if (i02.length() == 1) {
                return Character.valueOf(i02.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: " + i02);
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, Character ch) throws IOException {
            String valueOf;
            if (ch == null) {
                valueOf = null;
            } else {
                valueOf = String.valueOf(ch);
            }
            cVar.s0(valueOf);
        }
    }

    /* loaded from: classes3.dex */
    static class g extends com.google.gson.s<String> {
        g() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public String read(ja.a aVar) throws IOException {
            ja.b l02 = aVar.l0();
            if (l02 == ja.b.NULL) {
                aVar.c0();
                return null;
            } else if (l02 == ja.b.BOOLEAN) {
                return Boolean.toString(aVar.L());
            } else {
                return aVar.i0();
            }
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, String str) throws IOException {
            cVar.s0(str);
        }
    }

    /* loaded from: classes3.dex */
    static class h extends com.google.gson.s<BigDecimal> {
        h() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public BigDecimal read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            try {
                return new BigDecimal(aVar.i0());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.q0(bigDecimal);
        }
    }

    /* loaded from: classes3.dex */
    static class i extends com.google.gson.s<BigInteger> {
        i() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public BigInteger read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            try {
                return new BigInteger(aVar.i0());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, BigInteger bigInteger) throws IOException {
            cVar.q0(bigInteger);
        }
    }

    /* loaded from: classes3.dex */
    static class j extends com.google.gson.s<StringBuilder> {
        j() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public StringBuilder read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            return new StringBuilder(aVar.i0());
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, StringBuilder sb2) throws IOException {
            String sb3;
            if (sb2 == null) {
                sb3 = null;
            } else {
                sb3 = sb2.toString();
            }
            cVar.s0(sb3);
        }
    }

    /* loaded from: classes3.dex */
    static class k extends com.google.gson.s<Class> {
        k() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Class read(ja.a aVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* loaded from: classes3.dex */
    static class l extends com.google.gson.s<StringBuffer> {
        l() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public StringBuffer read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            return new StringBuffer(aVar.i0());
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, StringBuffer stringBuffer) throws IOException {
            String stringBuffer2;
            if (stringBuffer == null) {
                stringBuffer2 = null;
            } else {
                stringBuffer2 = stringBuffer.toString();
            }
            cVar.s0(stringBuffer2);
        }
    }

    /* loaded from: classes3.dex */
    static class m extends com.google.gson.s<URL> {
        m() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public URL read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            String i02 = aVar.i0();
            if ("null".equals(i02)) {
                return null;
            }
            return new URL(i02);
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, URL url) throws IOException {
            String externalForm;
            if (url == null) {
                externalForm = null;
            } else {
                externalForm = url.toExternalForm();
            }
            cVar.s0(externalForm);
        }
    }

    /* loaded from: classes3.dex */
    static class n extends com.google.gson.s<URI> {
        n() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public URI read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            try {
                String i02 = aVar.i0();
                if ("null".equals(i02)) {
                    return null;
                }
                return new URI(i02);
            } catch (URISyntaxException e10) {
                throw new JsonIOException(e10);
            }
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, URI uri) throws IOException {
            String aSCIIString;
            if (uri == null) {
                aSCIIString = null;
            } else {
                aSCIIString = uri.toASCIIString();
            }
            cVar.s0(aSCIIString);
        }
    }

    /* loaded from: classes3.dex */
    static class o extends com.google.gson.s<InetAddress> {
        o() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public InetAddress read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            return InetAddress.getByName(aVar.i0());
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, InetAddress inetAddress) throws IOException {
            String hostAddress;
            if (inetAddress == null) {
                hostAddress = null;
            } else {
                hostAddress = inetAddress.getHostAddress();
            }
            cVar.s0(hostAddress);
        }
    }

    /* loaded from: classes3.dex */
    static class p extends com.google.gson.s<UUID> {
        p() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public UUID read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            return UUID.fromString(aVar.i0());
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, UUID uuid) throws IOException {
            String uuid2;
            if (uuid == null) {
                uuid2 = null;
            } else {
                uuid2 = uuid.toString();
            }
            cVar.s0(uuid2);
        }
    }

    /* loaded from: classes3.dex */
    static class q extends com.google.gson.s<Currency> {
        q() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Currency read(ja.a aVar) throws IOException {
            return Currency.getInstance(aVar.i0());
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, Currency currency) throws IOException {
            cVar.s0(currency.getCurrencyCode());
        }
    }

    /* loaded from: classes3.dex */
    static class r extends com.google.gson.s<Calendar> {
        r() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Calendar read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            aVar.c();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.l0() != ja.b.END_OBJECT) {
                String V = aVar.V();
                int R = aVar.R();
                if ("year".equals(V)) {
                    i10 = R;
                } else if ("month".equals(V)) {
                    i11 = R;
                } else if ("dayOfMonth".equals(V)) {
                    i12 = R;
                } else if ("hourOfDay".equals(V)) {
                    i13 = R;
                } else if ("minute".equals(V)) {
                    i14 = R;
                } else if ("second".equals(V)) {
                    i15 = R;
                }
            }
            aVar.q();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.L();
                return;
            }
            cVar.e();
            cVar.E("year");
            cVar.l0(calendar.get(1));
            cVar.E("month");
            cVar.l0(calendar.get(2));
            cVar.E("dayOfMonth");
            cVar.l0(calendar.get(5));
            cVar.E("hourOfDay");
            cVar.l0(calendar.get(11));
            cVar.E("minute");
            cVar.l0(calendar.get(12));
            cVar.E("second");
            cVar.l0(calendar.get(13));
            cVar.q();
        }
    }

    /* loaded from: classes3.dex */
    static class s extends com.google.gson.s<Locale> {
        s() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Locale read(ja.a aVar) throws IOException {
            String str;
            String str2;
            String str3 = null;
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.i0(), "_");
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            } else {
                str = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str2 = stringTokenizer.nextToken();
            } else {
                str2 = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                str3 = stringTokenizer.nextToken();
            }
            if (str2 == null && str3 == null) {
                return new Locale(str);
            }
            if (str3 == null) {
                return new Locale(str, str2);
            }
            return new Locale(str, str2, str3);
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, Locale locale) throws IOException {
            String locale2;
            if (locale == null) {
                locale2 = null;
            } else {
                locale2 = locale.toString();
            }
            cVar.s0(locale2);
        }
    }

    /* loaded from: classes3.dex */
    static class t extends com.google.gson.s<com.google.gson.l> {
        t() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public com.google.gson.l read(ja.a aVar) throws IOException {
            switch (v.f12231a[aVar.l0().ordinal()]) {
                case 1:
                    return new com.google.gson.o((Number) new ga.f(aVar.i0()));
                case 2:
                    return new com.google.gson.o(Boolean.valueOf(aVar.L()));
                case 3:
                    return new com.google.gson.o(aVar.i0());
                case 4:
                    aVar.c0();
                    return com.google.gson.m.f12237f;
                case 5:
                    com.google.gson.i iVar = new com.google.gson.i();
                    aVar.b();
                    while (aVar.z()) {
                        iVar.r(read(aVar));
                    }
                    aVar.m();
                    return iVar;
                case 6:
                    com.google.gson.n nVar = new com.google.gson.n();
                    aVar.c();
                    while (aVar.z()) {
                        nVar.r(aVar.V(), read(aVar));
                    }
                    aVar.q();
                    return nVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, com.google.gson.l lVar) throws IOException {
            if (lVar != null && !lVar.n()) {
                if (lVar.p()) {
                    com.google.gson.o j10 = lVar.j();
                    if (j10.v()) {
                        cVar.q0(j10.s());
                        return;
                    } else if (j10.t()) {
                        cVar.x0(j10.a());
                        return;
                    } else {
                        cVar.s0(j10.l());
                        return;
                    }
                } else if (lVar.m()) {
                    cVar.d();
                    Iterator<com.google.gson.l> it = lVar.h().iterator();
                    while (it.hasNext()) {
                        write(cVar, it.next());
                    }
                    cVar.m();
                    return;
                } else if (lVar.o()) {
                    cVar.e();
                    for (Map.Entry<String, com.google.gson.l> entry : lVar.i().w()) {
                        cVar.E(entry.getKey());
                        write(cVar, entry.getValue());
                    }
                    cVar.q();
                    return;
                } else {
                    throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
                }
            }
            cVar.L();
        }
    }

    /* loaded from: classes3.dex */
    static class u extends com.google.gson.s<BitSet> {
        u() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            if (java.lang.Integer.parseInt(r1) != 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
        
            if (r8.R() != 0) goto L23;
         */
        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.util.BitSet read(ja.a r8) throws java.io.IOException {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.b()
                ja.b r1 = r8.l0()
                r2 = 0
                r3 = 0
            Le:
                ja.b r4 = ja.b.END_ARRAY
                if (r1 == r4) goto L75
                int[] r4 = com.google.gson.internal.bind.TypeAdapters.v.f12231a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L63
                r6 = 2
                if (r4 == r6) goto L5e
                r6 = 3
                if (r4 != r6) goto L47
                java.lang.String r1 = r8.i0()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                if (r1 == 0) goto L2e
                goto L69
            L2e:
                r5 = 0
                goto L69
            L30:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L47:
                com.google.gson.JsonSyntaxException r8 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L5e:
                boolean r5 = r8.L()
                goto L69
            L63:
                int r1 = r8.R()
                if (r1 == 0) goto L2e
            L69:
                if (r5 == 0) goto L6e
                r0.set(r3)
            L6e:
                int r3 = r3 + 1
                ja.b r1 = r8.l0()
                goto Le
            L75:
                r8.m()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.u.read(ja.a):java.util.BitSet");
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, BitSet bitSet) throws IOException {
            cVar.d();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.l0(bitSet.get(i10) ? 1L : 0L);
            }
            cVar.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class v {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12231a;

        static {
            int[] iArr = new int[ja.b.values().length];
            f12231a = iArr;
            try {
                iArr[ja.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12231a[ja.b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12231a[ja.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12231a[ja.b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12231a[ja.b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12231a[ja.b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12231a[ja.b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12231a[ja.b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12231a[ja.b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12231a[ja.b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes3.dex */
    static class w extends com.google.gson.s<Boolean> {
        w() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.s
        public Boolean read(ja.a aVar) throws IOException {
            ja.b l02 = aVar.l0();
            if (l02 == ja.b.NULL) {
                aVar.c0();
                return null;
            } else if (l02 == ja.b.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.i0()));
            } else {
                return Boolean.valueOf(aVar.L());
            }
        }

        @Override // com.google.gson.s
        public void write(ja.c cVar, Boolean bool) throws IOException {
            cVar.p0(bool);
        }
    }

    /* loaded from: classes3.dex */
    static class x extends com.google.gson.s<Boolean> {
        x() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.s
        public Boolean read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            return Boolean.valueOf(aVar.i0());
        }

        @Override // com.google.gson.s
        public void write(ja.c cVar, Boolean bool) throws IOException {
            cVar.s0(bool == null ? "null" : bool.toString());
        }
    }

    /* loaded from: classes3.dex */
    static class y extends com.google.gson.s<Number> {
        y() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Number read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.R());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, Number number) throws IOException {
            cVar.q0(number);
        }
    }

    /* loaded from: classes3.dex */
    static class z extends com.google.gson.s<Number> {
        z() {
        }

        @Override // com.google.gson.s
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Number read(ja.a aVar) throws IOException {
            if (aVar.l0() == ja.b.NULL) {
                aVar.c0();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.R());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // com.google.gson.s
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void write(ja.c cVar, Number number) throws IOException {
            cVar.q0(number);
        }
    }

    static {
        com.google.gson.s<Class> nullSafe = new k().nullSafe();
        f12187a = nullSafe;
        f12188b = b(Class.class, nullSafe);
        com.google.gson.s<BitSet> nullSafe2 = new u().nullSafe();
        f12189c = nullSafe2;
        f12190d = b(BitSet.class, nullSafe2);
        w wVar = new w();
        f12191e = wVar;
        f12192f = new x();
        f12193g = c(Boolean.TYPE, Boolean.class, wVar);
        y yVar = new y();
        f12194h = yVar;
        f12195i = c(Byte.TYPE, Byte.class, yVar);
        z zVar = new z();
        f12196j = zVar;
        f12197k = c(Short.TYPE, Short.class, zVar);
        a0 a0Var = new a0();
        f12198l = a0Var;
        f12199m = c(Integer.TYPE, Integer.class, a0Var);
        com.google.gson.s<AtomicInteger> nullSafe3 = new b0().nullSafe();
        f12200n = nullSafe3;
        f12201o = b(AtomicInteger.class, nullSafe3);
        com.google.gson.s<AtomicBoolean> nullSafe4 = new c0().nullSafe();
        f12202p = nullSafe4;
        f12203q = b(AtomicBoolean.class, nullSafe4);
        com.google.gson.s<AtomicIntegerArray> nullSafe5 = new a().nullSafe();
        f12204r = nullSafe5;
        f12205s = b(AtomicIntegerArray.class, nullSafe5);
        f12206t = new b();
        f12207u = new c();
        f12208v = new d();
        e eVar = new e();
        f12209w = eVar;
        f12210x = b(Number.class, eVar);
        f fVar = new f();
        f12211y = fVar;
        f12212z = c(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        A = gVar;
        B = new h();
        C = new i();
        D = b(String.class, gVar);
        j jVar = new j();
        E = jVar;
        F = b(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = b(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = b(URL.class, mVar);
        n nVar = new n();
        K = nVar;
        L = b(URI.class, nVar);
        o oVar = new o();
        M = oVar;
        N = e(InetAddress.class, oVar);
        p pVar = new p();
        O = pVar;
        P = b(UUID.class, pVar);
        com.google.gson.s<Currency> nullSafe6 = new q().nullSafe();
        Q = nullSafe6;
        R = b(Currency.class, nullSafe6);
        S = new com.google.gson.t() { // from class: com.google.gson.internal.bind.TypeAdapters.26

            /* renamed from: com.google.gson.internal.bind.TypeAdapters$26$a */
            /* loaded from: classes3.dex */
            class a extends com.google.gson.s<Timestamp> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ com.google.gson.s f12213a;

                a(com.google.gson.s sVar) {
                    this.f12213a = sVar;
                }

                @Override // com.google.gson.s
                /* renamed from: a  reason: merged with bridge method [inline-methods] */
                public Timestamp read(ja.a aVar) throws IOException {
                    Date date = (Date) this.f12213a.read(aVar);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }

                @Override // com.google.gson.s
                /* renamed from: b  reason: merged with bridge method [inline-methods] */
                public void write(ja.c cVar, Timestamp timestamp) throws IOException {
                    this.f12213a.write(cVar, timestamp);
                }
            }

            @Override // com.google.gson.t
            public <T> com.google.gson.s<T> a(com.google.gson.f fVar2, TypeToken<T> typeToken) {
                if (typeToken.getRawType() != Timestamp.class) {
                    return null;
                }
                return new a(fVar2.l(Date.class));
            }
        };
        r rVar = new r();
        T = rVar;
        U = d(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        V = sVar;
        W = b(Locale.class, sVar);
        t tVar = new t();
        X = tVar;
        Y = e(com.google.gson.l.class, tVar);
        Z = new com.google.gson.t() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.google.gson.t
            public <T> com.google.gson.s<T> a(com.google.gson.f fVar2, TypeToken<T> typeToken) {
                Class rawType = typeToken.getRawType();
                if (Enum.class.isAssignableFrom(rawType) && rawType != Enum.class) {
                    if (!rawType.isEnum()) {
                        rawType = (Class<? super Object>) rawType.getSuperclass();
                    }
                    return new d0(rawType);
                }
                return null;
            }
        };
    }

    public static <TT> com.google.gson.t a(final TypeToken<TT> typeToken, final com.google.gson.s<TT> sVar) {
        return new com.google.gson.t() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // com.google.gson.t
            public <T> com.google.gson.s<T> a(com.google.gson.f fVar, TypeToken<T> typeToken2) {
                if (typeToken2.equals(TypeToken.this)) {
                    return sVar;
                }
                return null;
            }
        };
    }

    public static <TT> com.google.gson.t b(final Class<TT> cls, final com.google.gson.s<TT> sVar) {
        return new com.google.gson.t() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // com.google.gson.t
            public <T> com.google.gson.s<T> a(com.google.gson.f fVar, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == cls) {
                    return sVar;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + sVar + "]";
            }
        };
    }

    public static <TT> com.google.gson.t c(final Class<TT> cls, final Class<TT> cls2, final com.google.gson.s<? super TT> sVar) {
        return new com.google.gson.t() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // com.google.gson.t
            public <T> com.google.gson.s<T> a(com.google.gson.f fVar, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (rawType != cls && rawType != cls2) {
                    return null;
                }
                return sVar;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + sVar + "]";
            }
        };
    }

    public static <TT> com.google.gson.t d(final Class<TT> cls, final Class<? extends TT> cls2, final com.google.gson.s<? super TT> sVar) {
        return new com.google.gson.t() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // com.google.gson.t
            public <T> com.google.gson.s<T> a(com.google.gson.f fVar, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (rawType != cls && rawType != cls2) {
                    return null;
                }
                return sVar;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + sVar + "]";
            }
        };
    }

    public static <T1> com.google.gson.t e(final Class<T1> cls, final com.google.gson.s<T1> sVar) {
        return new com.google.gson.t() { // from class: com.google.gson.internal.bind.TypeAdapters.35

            /* JADX INFO: Add missing generic type declarations: [T1] */
            /* renamed from: com.google.gson.internal.bind.TypeAdapters$35$a */
            /* loaded from: classes3.dex */
            class a<T1> extends com.google.gson.s<T1> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Class f12227a;

                a(Class cls) {
                    this.f12227a = cls;
                }

                @Override // com.google.gson.s
                public T1 read(ja.a aVar) throws IOException {
                    T1 t12 = (T1) sVar.read(aVar);
                    if (t12 != null && !this.f12227a.isInstance(t12)) {
                        throw new JsonSyntaxException("Expected a " + this.f12227a.getName() + " but was " + t12.getClass().getName());
                    }
                    return t12;
                }

                @Override // com.google.gson.s
                public void write(ja.c cVar, T1 t12) throws IOException {
                    sVar.write(cVar, t12);
                }
            }

            @Override // com.google.gson.t
            public <T2> com.google.gson.s<T2> a(com.google.gson.f fVar, TypeToken<T2> typeToken) {
                Class<? super T2> rawType = typeToken.getRawType();
                if (!cls.isAssignableFrom(rawType)) {
                    return null;
                }
                return new a(rawType);
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + sVar + "]";
            }
        };
    }
}
