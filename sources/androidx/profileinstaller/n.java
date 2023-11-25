package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProfileTranscoder.java */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f6482a = {112, 114, 111, 0};

    /* renamed from: b  reason: collision with root package name */
    static final byte[] f6483b = {112, 114, 109, 0};

    private static void A(InputStream inputStream) throws IOException {
        f.h(inputStream);
        int j10 = f.j(inputStream);
        if (j10 == 6 || j10 == 7) {
            return;
        }
        while (j10 > 0) {
            f.j(inputStream);
            for (int j11 = f.j(inputStream); j11 > 0; j11--) {
                f.h(inputStream);
            }
            j10--;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean B(OutputStream outputStream, byte[] bArr, e[] eVarArr) throws IOException {
        if (Arrays.equals(bArr, p.f6494a)) {
            N(outputStream, eVarArr);
            return true;
        } else if (Arrays.equals(bArr, p.f6495b)) {
            M(outputStream, eVarArr);
            return true;
        } else if (Arrays.equals(bArr, p.f6497d)) {
            K(outputStream, eVarArr);
            return true;
        } else if (Arrays.equals(bArr, p.f6496c)) {
            L(outputStream, eVarArr);
            return true;
        } else if (Arrays.equals(bArr, p.f6498e)) {
            J(outputStream, eVarArr);
            return true;
        } else {
            return false;
        }
    }

    private static void C(OutputStream outputStream, e eVar) throws IOException {
        int i10 = 0;
        for (int i11 : eVar.f6470h) {
            Integer valueOf = Integer.valueOf(i11);
            f.p(outputStream, valueOf.intValue() - i10);
            i10 = valueOf.intValue();
        }
    }

    private static q D(e[] eVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f.p(byteArrayOutputStream, eVarArr.length);
            int i10 = 2;
            for (e eVar : eVarArr) {
                f.q(byteArrayOutputStream, eVar.f6465c);
                f.q(byteArrayOutputStream, eVar.f6466d);
                f.q(byteArrayOutputStream, eVar.f6469g);
                String j10 = j(eVar.f6463a, eVar.f6464b, p.f6494a);
                int k10 = f.k(j10);
                f.p(byteArrayOutputStream, k10);
                i10 = i10 + 4 + 4 + 4 + 2 + (k10 * 1);
                f.n(byteArrayOutputStream, j10);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i10 == byteArray.length) {
                q qVar = new q(g.DEX_FILES, i10, byteArray, false);
                byteArrayOutputStream.close();
                return qVar;
            }
            throw f.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void E(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f6482a);
        outputStream.write(bArr);
    }

    private static void F(OutputStream outputStream, e eVar) throws IOException {
        I(outputStream, eVar);
        C(outputStream, eVar);
        H(outputStream, eVar);
    }

    private static void G(OutputStream outputStream, e eVar, String str) throws IOException {
        f.p(outputStream, f.k(str));
        f.p(outputStream, eVar.f6467e);
        f.q(outputStream, eVar.f6468f);
        f.q(outputStream, eVar.f6465c);
        f.q(outputStream, eVar.f6469g);
        f.n(outputStream, str);
    }

    private static void H(OutputStream outputStream, e eVar) throws IOException {
        byte[] bArr = new byte[k(eVar.f6469g)];
        for (Map.Entry<Integer, Integer> entry : eVar.f6471i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                z(bArr, 2, intValue, eVar);
            }
            if ((intValue2 & 4) != 0) {
                z(bArr, 4, intValue, eVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void I(OutputStream outputStream, e eVar) throws IOException {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> entry : eVar.f6471i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                f.p(outputStream, intValue - i10);
                f.p(outputStream, 0);
                i10 = intValue;
            }
        }
    }

    private static void J(OutputStream outputStream, e[] eVarArr) throws IOException {
        f.p(outputStream, eVarArr.length);
        for (e eVar : eVarArr) {
            String j10 = j(eVar.f6463a, eVar.f6464b, p.f6498e);
            f.p(outputStream, f.k(j10));
            f.p(outputStream, eVar.f6471i.size());
            f.p(outputStream, eVar.f6470h.length);
            f.q(outputStream, eVar.f6465c);
            f.n(outputStream, j10);
            Iterator<Integer> it = eVar.f6471i.keySet().iterator();
            while (it.hasNext()) {
                f.p(outputStream, it.next().intValue());
            }
            for (int i10 : eVar.f6470h) {
                f.p(outputStream, i10);
            }
        }
    }

    private static void K(OutputStream outputStream, e[] eVarArr) throws IOException {
        f.r(outputStream, eVarArr.length);
        for (e eVar : eVarArr) {
            int size = eVar.f6471i.size() * 4;
            String j10 = j(eVar.f6463a, eVar.f6464b, p.f6497d);
            f.p(outputStream, f.k(j10));
            f.p(outputStream, eVar.f6470h.length);
            f.q(outputStream, size);
            f.q(outputStream, eVar.f6465c);
            f.n(outputStream, j10);
            Iterator<Integer> it = eVar.f6471i.keySet().iterator();
            while (it.hasNext()) {
                f.p(outputStream, it.next().intValue());
                f.p(outputStream, 0);
            }
            for (int i10 : eVar.f6470h) {
                f.p(outputStream, i10);
            }
        }
    }

    private static void L(OutputStream outputStream, e[] eVarArr) throws IOException {
        byte[] b10 = b(eVarArr, p.f6496c);
        f.r(outputStream, eVarArr.length);
        f.m(outputStream, b10);
    }

    private static void M(OutputStream outputStream, e[] eVarArr) throws IOException {
        byte[] b10 = b(eVarArr, p.f6495b);
        f.r(outputStream, eVarArr.length);
        f.m(outputStream, b10);
    }

    private static void N(OutputStream outputStream, e[] eVarArr) throws IOException {
        O(outputStream, eVarArr);
    }

    private static void O(OutputStream outputStream, e[] eVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(eVarArr));
        arrayList.add(c(eVarArr));
        arrayList.add(d(eVarArr));
        long length2 = p.f6494a.length + f6482a.length + 4 + (arrayList.size() * 16);
        f.q(outputStream, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            q qVar = (q) arrayList.get(i10);
            f.q(outputStream, qVar.f6501a.getValue());
            f.q(outputStream, length2);
            if (qVar.f6504d) {
                byte[] bArr = qVar.f6503c;
                long length3 = bArr.length;
                byte[] b10 = f.b(bArr);
                arrayList2.add(b10);
                f.q(outputStream, b10.length);
                f.q(outputStream, length3);
                length = b10.length;
            } else {
                arrayList2.add(qVar.f6503c);
                f.q(outputStream, qVar.f6503c.length);
                f.q(outputStream, 0L);
                length = qVar.f6503c.length;
            }
            length2 += length;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            outputStream.write((byte[]) arrayList2.get(i11));
        }
    }

    private static int a(e eVar) {
        Iterator<Map.Entry<Integer, Integer>> it = eVar.f6471i.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= it.next().getValue().intValue();
        }
        return i10;
    }

    private static byte[] b(e[] eVarArr, byte[] bArr) throws IOException {
        int i10 = 0;
        int i11 = 0;
        for (e eVar : eVarArr) {
            i11 += f.k(j(eVar.f6463a, eVar.f6464b, bArr)) + 16 + (eVar.f6467e * 2) + eVar.f6468f + k(eVar.f6469g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        if (Arrays.equals(bArr, p.f6496c)) {
            int length = eVarArr.length;
            while (i10 < length) {
                e eVar2 = eVarArr[i10];
                G(byteArrayOutputStream, eVar2, j(eVar2.f6463a, eVar2.f6464b, bArr));
                F(byteArrayOutputStream, eVar2);
                i10++;
            }
        } else {
            for (e eVar3 : eVarArr) {
                G(byteArrayOutputStream, eVar3, j(eVar3.f6463a, eVar3.f6464b, bArr));
            }
            int length2 = eVarArr.length;
            while (i10 < length2) {
                F(byteArrayOutputStream, eVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == i11) {
            return byteArrayOutputStream.toByteArray();
        }
        throw f.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i11);
    }

    private static q c(e[] eVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < eVarArr.length; i11++) {
            try {
                e eVar = eVarArr[i11];
                f.p(byteArrayOutputStream, i11);
                f.p(byteArrayOutputStream, eVar.f6467e);
                i10 = i10 + 2 + 2 + (eVar.f6467e * 2);
                C(byteArrayOutputStream, eVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            q qVar = new q(g.CLASSES, i10, byteArray, true);
            byteArrayOutputStream.close();
            return qVar;
        }
        throw f.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    private static q d(e[] eVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < eVarArr.length; i11++) {
            try {
                e eVar = eVarArr[i11];
                int a10 = a(eVar);
                byte[] e10 = e(eVar);
                byte[] f10 = f(eVar);
                f.p(byteArrayOutputStream, i11);
                int length = e10.length + 2 + f10.length;
                f.q(byteArrayOutputStream, length);
                f.p(byteArrayOutputStream, a10);
                byteArrayOutputStream.write(e10);
                byteArrayOutputStream.write(f10);
                i10 = i10 + 2 + 4 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            q qVar = new q(g.METHODS, i10, byteArray, true);
            byteArrayOutputStream.close();
            return qVar;
        }
        throw f.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    private static byte[] e(e eVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, eVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] f(e eVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, eVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static String g(String str, String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        if (":".equals(str2)) {
            return str.replace("!", ":");
        }
        return str;
    }

    private static String h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        if (indexOf > 0) {
            return str.substring(indexOf + 1);
        }
        return str;
    }

    private static e i(e[] eVarArr, String str) {
        if (eVarArr.length <= 0) {
            return null;
        }
        String h10 = h(str);
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            if (eVarArr[i10].f6464b.equals(h10)) {
                return eVarArr[i10];
            }
        }
        return null;
    }

    private static String j(String str, String str2, byte[] bArr) {
        String a10 = p.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a10);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains("!") && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            return str + p.a(bArr) + str2;
        }
        return g(str2, a10);
    }

    private static int k(int i10) {
        return y(i10 * 2) / 8;
    }

    private static int l(int i10, int i11, int i12) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 4) {
                    return i11 + i12;
                }
                throw f.c("Unexpected flag: " + i10);
            }
            return i11;
        }
        throw f.c("HOT methods are not stored in the bitmap");
    }

    private static int[] m(InputStream inputStream, int i10) throws IOException {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += f.h(inputStream);
            iArr[i12] = i11;
        }
        return iArr;
    }

    private static int n(BitSet bitSet, int i10, int i11) {
        int i12 = 2;
        if (!bitSet.get(l(2, i10, i11))) {
            i12 = 0;
        }
        if (bitSet.get(l(4, i10, i11))) {
            return i12 | 4;
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] o(InputStream inputStream, byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, f.d(inputStream, bArr.length))) {
            return f.d(inputStream, p.f6495b.length);
        }
        throw f.c("Invalid magic");
    }

    private static void p(InputStream inputStream, e eVar) throws IOException {
        int available = inputStream.available() - eVar.f6468f;
        int i10 = 0;
        while (inputStream.available() > available) {
            i10 += f.h(inputStream);
            eVar.f6471i.put(Integer.valueOf(i10), 1);
            for (int h10 = f.h(inputStream); h10 > 0; h10--) {
                A(inputStream);
            }
        }
        if (inputStream.available() == available) {
            return;
        }
        throw f.c("Read too much data during profile line parse");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, e[] eVarArr) throws IOException {
        if (Arrays.equals(bArr, p.f6499f)) {
            if (!Arrays.equals(p.f6494a, bArr2)) {
                return r(inputStream, bArr, eVarArr);
            }
            throw f.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, p.f6500g)) {
            return t(inputStream, bArr2, eVarArr);
        } else {
            throw f.c("Unsupported meta version");
        }
    }

    static e[] r(InputStream inputStream, byte[] bArr, e[] eVarArr) throws IOException {
        if (Arrays.equals(bArr, p.f6499f)) {
            int j10 = f.j(inputStream);
            byte[] e10 = f.e(inputStream, (int) f.i(inputStream), (int) f.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
                try {
                    e[] s10 = s(byteArrayInputStream, j10, eVarArr);
                    byteArrayInputStream.close();
                    return s10;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw f.c("Content found after the end of file");
        }
        throw f.c("Unsupported meta version");
    }

    private static e[] s(InputStream inputStream, int i10, e[] eVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new e[0];
        }
        if (i10 == eVarArr.length) {
            String[] strArr = new String[i10];
            int[] iArr = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int h10 = f.h(inputStream);
                iArr[i11] = f.h(inputStream);
                strArr[i11] = f.f(inputStream, h10);
            }
            for (int i12 = 0; i12 < i10; i12++) {
                e eVar = eVarArr[i12];
                if (eVar.f6464b.equals(strArr[i12])) {
                    int i13 = iArr[i12];
                    eVar.f6467e = i13;
                    eVar.f6470h = m(inputStream, i13);
                } else {
                    throw f.c("Order of dexfiles in metadata did not match baseline");
                }
            }
            return eVarArr;
        }
        throw f.c("Mismatched number of dex files found in metadata");
    }

    static e[] t(InputStream inputStream, byte[] bArr, e[] eVarArr) throws IOException {
        int h10 = f.h(inputStream);
        byte[] e10 = f.e(inputStream, (int) f.i(inputStream), (int) f.i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
            try {
                e[] u10 = u(byteArrayInputStream, bArr, h10, eVarArr);
                byteArrayInputStream.close();
                return u10;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw f.c("Content found after the end of file");
    }

    private static e[] u(InputStream inputStream, byte[] bArr, int i10, e[] eVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new e[0];
        }
        if (i10 == eVarArr.length) {
            for (int i11 = 0; i11 < i10; i11++) {
                f.h(inputStream);
                String f10 = f.f(inputStream, f.h(inputStream));
                long i12 = f.i(inputStream);
                int h10 = f.h(inputStream);
                e i13 = i(eVarArr, f10);
                if (i13 != null) {
                    i13.f6466d = i12;
                    int[] m10 = m(inputStream, h10);
                    if (Arrays.equals(bArr, p.f6498e)) {
                        i13.f6467e = h10;
                        i13.f6470h = m10;
                    }
                } else {
                    throw f.c("Missing profile key: " + f10);
                }
            }
            return eVarArr;
        }
        throw f.c("Mismatched number of dex files found in metadata");
    }

    private static void v(InputStream inputStream, e eVar) throws IOException {
        BitSet valueOf = BitSet.valueOf(f.d(inputStream, f.a(eVar.f6469g * 2)));
        int i10 = 0;
        while (true) {
            int i11 = eVar.f6469g;
            if (i10 < i11) {
                int n10 = n(valueOf, i10, i11);
                if (n10 != 0) {
                    Integer num = eVar.f6471i.get(Integer.valueOf(i10));
                    if (num == null) {
                        num = 0;
                    }
                    eVar.f6471i.put(Integer.valueOf(i10), Integer.valueOf(n10 | num.intValue()));
                }
                i10++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e[] w(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (Arrays.equals(bArr, p.f6495b)) {
            int j10 = f.j(inputStream);
            byte[] e10 = f.e(inputStream, (int) f.i(inputStream), (int) f.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
                try {
                    e[] x10 = x(byteArrayInputStream, str, j10);
                    byteArrayInputStream.close();
                    return x10;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw f.c("Content found after the end of file");
        }
        throw f.c("Unsupported version");
    }

    private static e[] x(InputStream inputStream, String str, int i10) throws IOException {
        if (inputStream.available() == 0) {
            return new e[0];
        }
        e[] eVarArr = new e[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int h10 = f.h(inputStream);
            int h11 = f.h(inputStream);
            long i12 = f.i(inputStream);
            eVarArr[i11] = new e(str, f.f(inputStream, h10), f.i(inputStream), 0L, h11, (int) i12, (int) f.i(inputStream), new int[h11], new TreeMap());
        }
        for (int i13 = 0; i13 < i10; i13++) {
            e eVar = eVarArr[i13];
            p(inputStream, eVar);
            eVar.f6470h = m(inputStream, eVar.f6467e);
            v(inputStream, eVar);
        }
        return eVarArr;
    }

    private static int y(int i10) {
        return ((i10 + 8) - 1) & (-8);
    }

    private static void z(byte[] bArr, int i10, int i11, e eVar) {
        int l10 = l(i10, i11, eVar.f6469g);
        int i12 = l10 / 8;
        bArr[i12] = (byte) ((1 << (l10 % 8)) | bArr[i12]);
    }
}
