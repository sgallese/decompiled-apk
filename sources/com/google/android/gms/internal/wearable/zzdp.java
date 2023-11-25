package com.google.android.gms.internal.wearable;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzdp {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzdn zzdnVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zzd(zzdnVar, sb2, 0);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb2, i10, str, it.next());
            }
        } else if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb2, i10, str, (Map.Entry) it2.next());
            }
        } else {
            sb2.append('\n');
            zzc(i10, sb2);
            if (!str.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Character.toLowerCase(str.charAt(0)));
                for (int i11 = 1; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (Character.isUpperCase(charAt)) {
                        sb3.append("_");
                    }
                    sb3.append(Character.toLowerCase(charAt));
                }
                str = sb3.toString();
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(zzen.zza(new zzbe(((String) obj).getBytes(zzco.zzb))));
                sb2.append('\"');
            } else if (obj instanceof zzbh) {
                sb2.append(": \"");
                sb2.append(zzen.zza((zzbh) obj));
                sb2.append('\"');
            } else if (obj instanceof zzcg) {
                sb2.append(" {");
                zzd((zzcg) obj, sb2, i10 + 2);
                sb2.append("\n");
                zzc(i10, sb2);
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i12 = i10 + 2;
                zzb(sb2, i12, "key", entry.getKey());
                zzb(sb2, i12, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
                sb2.append("\n");
                zzc(i10, sb2);
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj);
            }
        }
    }

    private static void zzc(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(zza, 0, i11);
            i10 -= i11;
        }
    }

    private static void zzd(zzdn zzdnVar, StringBuilder sb2, int i10) {
        int i11;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzdnVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i11);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb2, i10, substring.substring(0, substring.length() - 4), zzcg.zzX(method2, zzdnVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i10, substring.substring(0, substring.length() - 3), zzcg.zzX(method, zzdnVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzX = zzcg.zzX(method4, zzdnVar, new Object[0]);
                    if (method5 == null) {
                        if (zzX instanceof Boolean) {
                            if (!((Boolean) zzX).booleanValue()) {
                            }
                            zzb(sb2, i10, substring, zzX);
                        } else if (zzX instanceof Integer) {
                            if (((Integer) zzX).intValue() == 0) {
                            }
                            zzb(sb2, i10, substring, zzX);
                        } else if (zzX instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzX).floatValue()) == 0) {
                            }
                            zzb(sb2, i10, substring, zzX);
                        } else if (zzX instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzX).doubleValue()) == 0) {
                            }
                            zzb(sb2, i10, substring, zzX);
                        } else {
                            if (zzX instanceof String) {
                                equals = zzX.equals("");
                            } else if (zzX instanceof zzbh) {
                                equals = zzX.equals(zzbh.zzb);
                            } else if (zzX instanceof zzdn) {
                                if (zzX == ((zzdn) zzX).zzag()) {
                                }
                                zzb(sb2, i10, substring, zzX);
                            } else {
                                if ((zzX instanceof Enum) && ((Enum) zzX).ordinal() == 0) {
                                }
                                zzb(sb2, i10, substring, zzX);
                            }
                            if (equals) {
                            }
                            zzb(sb2, i10, substring, zzX);
                        }
                    } else {
                        if (!((Boolean) zzcg.zzX(method5, zzdnVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb2, i10, substring, zzX);
                    }
                }
            }
            i11 = 3;
        }
        if (!(zzdnVar instanceof zzce)) {
            zzeq zzeqVar = ((zzcg) zzdnVar).zzc;
            if (zzeqVar != null) {
                zzeqVar.zzi(sb2, i10);
                return;
            }
            return;
        }
        zzce zzceVar = (zzce) zzdnVar;
        throw null;
    }
}
