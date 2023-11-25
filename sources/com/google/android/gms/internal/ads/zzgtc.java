package com.google.android.gms.internal.ads;

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
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgtc {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzgta zzgtaVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zzd(zzgtaVar, sb2, 0);
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
                sb2.append(zzgui.zza(zzgqi.zzw((String) obj)));
                sb2.append('\"');
            } else if (obj instanceof zzgqi) {
                sb2.append(": \"");
                sb2.append(zzgui.zza((zzgqi) obj));
                sb2.append('\"');
            } else if (obj instanceof zzgrq) {
                sb2.append(" {");
                zzd((zzgrq) obj, sb2, i10 + 2);
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

    private static void zzd(zzgta zzgtaVar, StringBuilder sb2, int i10) {
        int i11;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzgtaVar.getClass().getDeclaredMethods();
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
                zzb(sb2, i10, substring.substring(0, substring.length() - 4), zzgrq.zzaQ(method2, zzgtaVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i10, substring.substring(0, substring.length() - 3), zzgrq.zzaQ(method, zzgtaVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzaQ = zzgrq.zzaQ(method4, zzgtaVar, new Object[0]);
                    if (method5 == null) {
                        if (zzaQ instanceof Boolean) {
                            if (!((Boolean) zzaQ).booleanValue()) {
                            }
                            zzb(sb2, i10, substring, zzaQ);
                        } else if (zzaQ instanceof Integer) {
                            if (((Integer) zzaQ).intValue() == 0) {
                            }
                            zzb(sb2, i10, substring, zzaQ);
                        } else if (zzaQ instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzaQ).floatValue()) == 0) {
                            }
                            zzb(sb2, i10, substring, zzaQ);
                        } else if (zzaQ instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzaQ).doubleValue()) == 0) {
                            }
                            zzb(sb2, i10, substring, zzaQ);
                        } else {
                            if (zzaQ instanceof String) {
                                equals = zzaQ.equals("");
                            } else if (zzaQ instanceof zzgqi) {
                                equals = zzaQ.equals(zzgqi.zzb);
                            } else if (zzaQ instanceof zzgta) {
                                if (zzaQ == ((zzgta) zzaQ).zzbf()) {
                                }
                                zzb(sb2, i10, substring, zzaQ);
                            } else {
                                if ((zzaQ instanceof Enum) && ((Enum) zzaQ).ordinal() == 0) {
                                }
                                zzb(sb2, i10, substring, zzaQ);
                            }
                            if (equals) {
                            }
                            zzb(sb2, i10, substring, zzaQ);
                        }
                    } else {
                        if (!((Boolean) zzgrq.zzaQ(method5, zzgtaVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb2, i10, substring, zzaQ);
                    }
                }
            }
            i11 = 3;
        }
        if (!(zzgtaVar instanceof zzgrn)) {
            zzgul zzgulVar = ((zzgrq) zzgtaVar).zzc;
            if (zzgulVar != null) {
                zzgulVar.zzi(sb2, i10);
                return;
            }
            return;
        }
        zzgrn zzgrnVar = (zzgrn) zzgtaVar;
        throw null;
    }
}