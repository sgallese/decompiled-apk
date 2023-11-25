package h2;

import ec.p;
import h2.c;
import j0.l;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import qc.q;

/* compiled from: ComposableInvoker.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16444a = new a();

    private a() {
    }

    private final int a(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return (int) Math.ceil((i10 + i11) / 10.0d);
    }

    private final boolean b(Class<?>[] clsArr, Class<?>[] clsArr2) {
        boolean z10;
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        int length = clsArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            arrayList.add(Boolean.valueOf(clsArr[i10].isAssignableFrom(clsArr2[i11])));
            i10++;
            i11++;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (!z10) {
            return false;
        }
        return true;
    }

    private final int c(int i10) {
        return (int) Math.ceil(i10 / 31.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7 A[LOOP:2: B:19:0x0080->B:29:0x00b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.reflect.Method d(java.lang.Class<?> r9, java.lang.String r10, java.lang.Object... r11) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r2 = r11.length     // Catch: java.lang.ReflectiveOperationException -> L75
            int r2 = r8.a(r2, r1)     // Catch: java.lang.ReflectiveOperationException -> L75
            qc.i0 r3 = new qc.i0     // Catch: java.lang.ReflectiveOperationException -> L75
            r4 = 3
            r3.<init>(r4)     // Catch: java.lang.ReflectiveOperationException -> L75
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.ReflectiveOperationException -> L75
            r4.<init>()     // Catch: java.lang.ReflectiveOperationException -> L75
            int r5 = r11.length     // Catch: java.lang.ReflectiveOperationException -> L75
            r6 = 0
        L14:
            if (r6 >= r5) goto L28
            r7 = r11[r6]     // Catch: java.lang.ReflectiveOperationException -> L75
            if (r7 == 0) goto L1f
            java.lang.Class r7 = r7.getClass()     // Catch: java.lang.ReflectiveOperationException -> L75
            goto L20
        L1f:
            r7 = r0
        L20:
            if (r7 == 0) goto L25
            r4.add(r7)     // Catch: java.lang.ReflectiveOperationException -> L75
        L25:
            int r6 = r6 + 1
            goto L14
        L28:
            java.lang.Class[] r11 = new java.lang.Class[r1]     // Catch: java.lang.ReflectiveOperationException -> L75
            java.lang.Object[] r11 = r4.toArray(r11)     // Catch: java.lang.ReflectiveOperationException -> L75
            r3.b(r11)     // Catch: java.lang.ReflectiveOperationException -> L75
            java.lang.Class<j0.l> r11 = j0.l.class
            r3.a(r11)     // Catch: java.lang.ReflectiveOperationException -> L75
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch: java.lang.ReflectiveOperationException -> L75
            vc.f r2 = vc.j.s(r1, r2)     // Catch: java.lang.ReflectiveOperationException -> L75
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.ReflectiveOperationException -> L75
            r5 = 10
            int r5 = ec.r.s(r2, r5)     // Catch: java.lang.ReflectiveOperationException -> L75
            r4.<init>(r5)     // Catch: java.lang.ReflectiveOperationException -> L75
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.ReflectiveOperationException -> L75
        L4b:
            boolean r5 = r2.hasNext()     // Catch: java.lang.ReflectiveOperationException -> L75
            if (r5 == 0) goto L5b
            r5 = r2
            ec.h0 r5 = (ec.h0) r5     // Catch: java.lang.ReflectiveOperationException -> L75
            r5.a()     // Catch: java.lang.ReflectiveOperationException -> L75
            r4.add(r11)     // Catch: java.lang.ReflectiveOperationException -> L75
            goto L4b
        L5b:
            java.lang.Class[] r11 = new java.lang.Class[r1]     // Catch: java.lang.ReflectiveOperationException -> L75
            java.lang.Object[] r11 = r4.toArray(r11)     // Catch: java.lang.ReflectiveOperationException -> L75
            r3.b(r11)     // Catch: java.lang.ReflectiveOperationException -> L75
            int r11 = r3.c()     // Catch: java.lang.ReflectiveOperationException -> L75
            java.lang.Class[] r11 = new java.lang.Class[r11]     // Catch: java.lang.ReflectiveOperationException -> L75
            java.lang.Object[] r11 = r3.d(r11)     // Catch: java.lang.ReflectiveOperationException -> L75
            java.lang.Class[] r11 = (java.lang.Class[]) r11     // Catch: java.lang.ReflectiveOperationException -> L75
            java.lang.reflect.Method r11 = r8.e(r9, r10, r11)     // Catch: java.lang.ReflectiveOperationException -> L75
            goto Lbc
        L75:
            java.lang.reflect.Method[] r11 = r9.getDeclaredMethods()     // Catch: java.lang.ReflectiveOperationException -> Lba
            java.lang.String r2 = "declaredMethods"
            qc.q.h(r11, r2)     // Catch: java.lang.ReflectiveOperationException -> Lba
            int r2 = r11.length     // Catch: java.lang.ReflectiveOperationException -> Lba
            r3 = 0
        L80:
            if (r3 >= r2) goto Lbb
            r4 = r11[r3]     // Catch: java.lang.ReflectiveOperationException -> Lba
            java.lang.String r5 = r4.getName()     // Catch: java.lang.ReflectiveOperationException -> Lba
            boolean r5 = qc.q.d(r5, r10)     // Catch: java.lang.ReflectiveOperationException -> Lba
            if (r5 != 0) goto Lb2
            java.lang.String r5 = r4.getName()     // Catch: java.lang.ReflectiveOperationException -> Lba
            java.lang.String r6 = "it.name"
            qc.q.h(r5, r6)     // Catch: java.lang.ReflectiveOperationException -> Lba
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.ReflectiveOperationException -> Lba
            r6.<init>()     // Catch: java.lang.ReflectiveOperationException -> Lba
            r6.append(r10)     // Catch: java.lang.ReflectiveOperationException -> Lba
            r7 = 45
            r6.append(r7)     // Catch: java.lang.ReflectiveOperationException -> Lba
            java.lang.String r6 = r6.toString()     // Catch: java.lang.ReflectiveOperationException -> Lba
            r7 = 2
            boolean r5 = yc.m.F(r5, r6, r1, r7, r0)     // Catch: java.lang.ReflectiveOperationException -> Lba
            if (r5 == 0) goto Lb0
            goto Lb2
        Lb0:
            r5 = 0
            goto Lb3
        Lb2:
            r5 = 1
        Lb3:
            if (r5 == 0) goto Lb7
            r0 = r4
            goto Lbb
        Lb7:
            int r3 = r3 + 1
            goto L80
        Lba:
        Lbb:
            r11 = r0
        Lbc:
            if (r11 == 0) goto Lbf
            return r11
        Lbf:
            java.lang.NoSuchMethodException r11 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = r9.getName()
            r0.append(r9)
            r9 = 46
            r0.append(r9)
            r0.append(r10)
            java.lang.String r9 = r0.toString()
            r11.<init>(r9)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.a.d(java.lang.Class, java.lang.String, java.lang.Object[]):java.lang.reflect.Method");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[LOOP:0: B:3:0x0013->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.reflect.Method e(java.lang.Class<?> r9, java.lang.String r10, java.lang.Class<?>... r11) {
        /*
            r8 = this;
            int r0 = r11.length
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r0)
            java.lang.Class[] r11 = (java.lang.Class[]) r11
            java.lang.reflect.Method[] r9 = r9.getDeclaredMethods()
            java.lang.String r0 = "declaredMethods"
            qc.q.h(r9, r0)
            int r0 = r9.length
            r1 = 0
            r2 = 0
        L13:
            r3 = 0
            if (r2 >= r0) goto L5e
            r4 = r9[r2]
            java.lang.String r5 = r4.getName()
            boolean r5 = qc.q.d(r10, r5)
            if (r5 != 0) goto L43
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "it.name"
            qc.q.h(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r10)
            r7 = 45
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 2
            boolean r3 = yc.m.F(r5, r6, r1, r7, r3)
            if (r3 == 0) goto L56
        L43:
            h2.a r3 = h2.a.f16444a
            java.lang.Class[] r5 = r4.getParameterTypes()
            java.lang.String r6 = "it.parameterTypes"
            qc.q.h(r5, r6)
            boolean r3 = r3.b(r5, r11)
            if (r3 == 0) goto L56
            r3 = 1
            goto L57
        L56:
            r3 = 0
        L57:
            if (r3 == 0) goto L5b
            r3 = r4
            goto L5e
        L5b:
            int r2 = r2 + 1
            goto L13
        L5e:
            if (r3 == 0) goto L61
            return r3
        L61:
            java.lang.NoSuchMethodException r9 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            java.lang.String r10 = " not found"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.a.e(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    private final Object f(Class<?> cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(0.0d);
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return 0;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return (byte) 0;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return (char) 0;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return 0L;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.FALSE;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return Float.valueOf(0.0f);
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return (short) 0;
                }
                break;
        }
        return null;
    }

    private final Object h(Method method, Object obj, l lVar, Object... objArr) {
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Object obj2;
        int P;
        Class<?>[] parameterTypes = method.getParameterTypes();
        q.h(parameterTypes, "parameterTypes");
        int i12 = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i13 = length - 1;
                if (q.d(parameterTypes[length], l.class)) {
                    i12 = length;
                    break;
                } else if (i13 < 0) {
                    break;
                } else {
                    length = i13;
                }
            }
        }
        if (obj != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i14 = i12 + 1;
        int a10 = a(i12, i10) + i14;
        int length2 = method.getParameterTypes().length;
        if (length2 != a10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i11 = c(i12);
        } else {
            i11 = 0;
        }
        if (i11 + a10 == length2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            Object[] objArr2 = new Object[length2];
            for (int i15 = 0; i15 < length2; i15++) {
                if (i15 >= 0 && i15 < i12) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (i15 >= 0) {
                        P = p.P(objArr);
                        if (i15 <= P) {
                            obj2 = objArr[i15];
                        }
                    }
                    a aVar = f16444a;
                    Class<?> cls = method.getParameterTypes()[i15];
                    q.h(cls, "parameterTypes[idx]");
                    obj2 = aVar.f(cls);
                } else if (i15 == i12) {
                    obj2 = lVar;
                } else {
                    if (i14 <= i15 && i15 < a10) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        obj2 = 0;
                    } else {
                        if (a10 <= i15 && i15 < length2) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            obj2 = 2097151;
                        } else {
                            throw new IllegalStateException("Unexpected index".toString());
                        }
                    }
                }
                objArr2[i15] = obj2;
            }
            return method.invoke(obj, Arrays.copyOf(objArr2, length2));
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void g(String str, String str2, l lVar, Object... objArr) {
        q.i(str, "className");
        q.i(str2, "methodName");
        q.i(lVar, "composer");
        q.i(objArr, "args");
        try {
            Class<?> cls = Class.forName(str);
            q.h(cls, "composableClass");
            Method d10 = d(cls, str2, Arrays.copyOf(objArr, objArr.length));
            d10.setAccessible(true);
            if (Modifier.isStatic(d10.getModifiers())) {
                h(d10, null, lVar, Arrays.copyOf(objArr, objArr.length));
            } else {
                h(d10, cls.getConstructor(new Class[0]).newInstance(new Object[0]), lVar, Arrays.copyOf(objArr, objArr.length));
            }
        } catch (ReflectiveOperationException e10) {
            c.a.c(c.f16448a, "Failed to invoke Composable Method '" + str + '.' + str2 + '\'', null, 2, null);
            throw e10;
        }
    }
}
