package com.google.android.gms.wearable;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.wearable.zzcq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public class DataMap {
    public static final String TAG = "DataMap";
    private final HashMap zza = new HashMap();

    public static ArrayList<DataMap> arrayListFromBundleArrayList(ArrayList<Bundle> arrayList) {
        ArrayList<DataMap> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(fromBundle(arrayList.get(i10)));
        }
        return arrayList2;
    }

    public static DataMap fromBundle(Bundle bundle) {
        bundle.setClassLoader((ClassLoader) Preconditions.checkNotNull(Asset.class.getClassLoader()));
        DataMap dataMap = new DataMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                dataMap.putString(str, (String) obj);
            } else if (obj instanceof Integer) {
                dataMap.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                dataMap.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                dataMap.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Float) {
                dataMap.putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Boolean) {
                dataMap.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataMap.putByte(str, ((Byte) obj).byteValue());
            } else if (obj instanceof byte[]) {
                dataMap.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof String[]) {
                dataMap.putStringArray(str, (String[]) obj);
            } else if (obj instanceof long[]) {
                dataMap.putLongArray(str, (long[]) obj);
            } else if (obj instanceof float[]) {
                dataMap.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof Asset) {
                dataMap.putAsset(str, (Asset) obj);
            } else if (obj instanceof Bundle) {
                dataMap.putDataMap(str, fromBundle((Bundle) obj));
            } else if (obj instanceof ArrayList) {
                ArrayList<String> arrayList = (ArrayList) obj;
                int zza = zza(arrayList);
                if (zza != 0) {
                    if (zza != 1) {
                        if (zza != 2) {
                            if (zza != 3) {
                                if (zza == 5) {
                                    dataMap.putDataMapArrayList(str, arrayListFromBundleArrayList(arrayList));
                                }
                            } else {
                                dataMap.putStringArrayList(str, arrayList);
                            }
                        } else {
                            dataMap.putIntegerArrayList(str, arrayList);
                        }
                    } else {
                        dataMap.putStringArrayList(str, arrayList);
                    }
                } else {
                    dataMap.putStringArrayList(str, arrayList);
                }
            }
        }
        return dataMap;
    }

    public static DataMap fromByteArray(byte[] bArr) {
        try {
            return com.google.android.gms.internal.wearable.zzl.zza(new com.google.android.gms.internal.wearable.zzk(com.google.android.gms.internal.wearable.zzx.zzc(bArr), new ArrayList()));
        } catch (zzcq e10) {
            throw new IllegalArgumentException("Unable to convert data", e10);
        }
    }

    private static int zza(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return 0;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            if (obj != null) {
                if (obj instanceof Integer) {
                    return 2;
                }
                if (obj instanceof String) {
                    return 3;
                }
                if (obj instanceof DataMap) {
                    return 4;
                }
                if (obj instanceof Bundle) {
                    return 5;
                }
            }
        }
        return 1;
    }

    private static final void zzb(String str, Object obj, String str2, Object obj2, ClassCastException classCastException) {
        Log.w(TAG, "Key " + str + " expected " + str2 + " but value was a " + obj.getClass().getName() + ".  The default value " + obj2 + " was returned.");
        Log.w(TAG, "Attempt to cast generated internal exception:", classCastException);
    }

    public void clear() {
        this.zza.clear();
    }

    public boolean containsKey(String str) {
        return this.zza.containsKey(str);
    }

    public boolean equals(Object obj) {
        boolean equals;
        if (!(obj instanceof DataMap)) {
            return false;
        }
        DataMap dataMap = (DataMap) obj;
        if (size() != dataMap.size()) {
            return false;
        }
        for (String str : keySet()) {
            Object obj2 = get(str);
            Object obj3 = dataMap.get(str);
            if (obj2 instanceof Asset) {
                if (!(obj3 instanceof Asset)) {
                    return false;
                }
                Asset asset = (Asset) obj2;
                Asset asset2 = (Asset) obj3;
                if (asset != null && asset2 != null) {
                    if (!TextUtils.isEmpty(asset.getDigest())) {
                        equals = ((String) Preconditions.checkNotNull(asset.getDigest())).equals(asset2.getDigest());
                    } else {
                        equals = Arrays.equals(asset.zza(), asset2.zza());
                    }
                    if (!equals) {
                        return false;
                    }
                } else if (asset != asset2) {
                    return false;
                }
            } else if (obj2 instanceof String[]) {
                if (!(obj3 instanceof String[]) || !Arrays.equals((String[]) obj2, (String[]) obj3)) {
                    return false;
                }
            } else if (obj2 instanceof long[]) {
                if (!(obj3 instanceof long[]) || !Arrays.equals((long[]) obj2, (long[]) obj3)) {
                    return false;
                }
            } else if (obj2 instanceof float[]) {
                if (!(obj3 instanceof float[]) || !Arrays.equals((float[]) obj2, (float[]) obj3)) {
                    return false;
                }
            } else if (obj2 instanceof byte[]) {
                if (!(obj3 instanceof byte[]) || !Arrays.equals((byte[]) obj2, (byte[]) obj3)) {
                    return false;
                }
            } else if (!Objects.equal(obj2, obj3)) {
                return false;
            }
        }
        return true;
    }

    public <T> T get(String str) {
        return (T) this.zza.get(str);
    }

    public Asset getAsset(String str) {
        Object obj = this.zza.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (Asset) obj;
        } catch (ClassCastException e10) {
            zzb(str, obj, "Asset", "<null>", e10);
            return null;
        }
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public byte getByte(String str) {
        return getByte(str, (byte) 0);
    }

    public byte[] getByteArray(String str) {
        Object obj = this.zza.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (byte[]) obj;
        } catch (ClassCastException e10) {
            zzb(str, obj, "byte[]", "<null>", e10);
            return null;
        }
    }

    public DataMap getDataMap(String str) {
        Object obj = this.zza.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (DataMap) obj;
        } catch (ClassCastException e10) {
            zzb(str, obj, TAG, "<null>", e10);
            return null;
        }
    }

    public ArrayList<DataMap> getDataMapArrayList(String str) {
        Object obj = this.zza.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e10) {
            zzb(str, obj, "ArrayList<DataMap>", "<null>", e10);
            return null;
        }
    }

    public double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public float[] getFloatArray(String str) {
        Object obj = this.zza.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (float[]) obj;
        } catch (ClassCastException e10) {
            zzb(str, obj, "float[]", "<null>", e10);
            return null;
        }
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public ArrayList<Integer> getIntegerArrayList(String str) {
        Object obj = this.zza.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e10) {
            zzb(str, obj, "ArrayList<Integer>", "<null>", e10);
            return null;
        }
    }

    public long getLong(String str) {
        return getLong(str, 0L);
    }

    public long[] getLongArray(String str) {
        Object obj = this.zza.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (long[]) obj;
        } catch (ClassCastException e10) {
            zzb(str, obj, "long[]", "<null>", e10);
            return null;
        }
    }

    public String getString(String str) {
        Object obj = this.zza.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String) obj;
        } catch (ClassCastException e10) {
            zzb(str, obj, "String", "<null>", e10);
            return null;
        }
    }

    public String[] getStringArray(String str) {
        Object obj = this.zza.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String[]) obj;
        } catch (ClassCastException e10) {
            zzb(str, obj, "String[]", "<null>", e10);
            return null;
        }
    }

    public ArrayList<String> getStringArrayList(String str) {
        Object obj = this.zza.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e10) {
            zzb(str, obj, "ArrayList<String>", "<null>", e10);
            return null;
        }
    }

    public int hashCode() {
        return this.zza.hashCode() * 29;
    }

    public boolean isEmpty() {
        return this.zza.isEmpty();
    }

    public Set<String> keySet() {
        return this.zza.keySet();
    }

    public void putAll(DataMap dataMap) {
        for (String str : dataMap.keySet()) {
            this.zza.put(str, dataMap.get(str));
        }
    }

    public void putAsset(String str, Asset asset) {
        this.zza.put(str, asset);
    }

    public void putBoolean(String str, boolean z10) {
        this.zza.put(str, Boolean.valueOf(z10));
    }

    public void putByte(String str, byte b10) {
        this.zza.put(str, Byte.valueOf(b10));
    }

    public void putByteArray(String str, byte[] bArr) {
        this.zza.put(str, bArr);
    }

    public void putDataMap(String str, DataMap dataMap) {
        this.zza.put(str, dataMap);
    }

    public void putDataMapArrayList(String str, ArrayList<DataMap> arrayList) {
        this.zza.put(str, arrayList);
    }

    public void putDouble(String str, double d10) {
        this.zza.put(str, Double.valueOf(d10));
    }

    public void putFloat(String str, float f10) {
        this.zza.put(str, Float.valueOf(f10));
    }

    public void putFloatArray(String str, float[] fArr) {
        this.zza.put(str, fArr);
    }

    public void putInt(String str, int i10) {
        this.zza.put(str, Integer.valueOf(i10));
    }

    public void putIntegerArrayList(String str, ArrayList<Integer> arrayList) {
        this.zza.put(str, arrayList);
    }

    public void putLong(String str, long j10) {
        this.zza.put(str, Long.valueOf(j10));
    }

    public void putLongArray(String str, long[] jArr) {
        this.zza.put(str, jArr);
    }

    public void putString(String str, String str2) {
        this.zza.put(str, str2);
    }

    public void putStringArray(String str, String[] strArr) {
        this.zza.put(str, strArr);
    }

    public void putStringArrayList(String str, ArrayList<String> arrayList) {
        this.zza.put(str, arrayList);
    }

    public Object remove(String str) {
        return this.zza.remove(str);
    }

    public int size() {
        return this.zza.size();
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        for (String str : this.zza.keySet()) {
            Object obj = this.zza.get(str);
            if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Byte) obj).byteValue());
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof String[]) {
                bundle.putStringArray(str, (String[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof Asset) {
                bundle.putParcelable(str, (Asset) obj);
            } else if (obj instanceof DataMap) {
                bundle.putParcelable(str, ((DataMap) obj).toBundle());
            } else if (obj instanceof ArrayList) {
                ArrayList<String> arrayList = (ArrayList) obj;
                int zza = zza(arrayList);
                if (zza != 0) {
                    if (zza != 1) {
                        if (zza != 2) {
                            if (zza != 3) {
                                if (zza == 4) {
                                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                                    int size = arrayList.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        arrayList2.add(((DataMap) arrayList.get(i10)).toBundle());
                                    }
                                    bundle.putParcelableArrayList(str, arrayList2);
                                }
                            } else {
                                bundle.putStringArrayList(str, arrayList);
                            }
                        } else {
                            bundle.putIntegerArrayList(str, arrayList);
                        }
                    } else {
                        bundle.putStringArrayList(str, arrayList);
                    }
                } else {
                    bundle.putStringArrayList(str, arrayList);
                }
            }
        }
        return bundle;
    }

    public byte[] toByteArray() {
        return com.google.android.gms.internal.wearable.zzl.zzb(this).zza.zzK();
    }

    public String toString() {
        return this.zza.toString();
    }

    public boolean getBoolean(String str, boolean z10) {
        Object obj = this.zza.get(str);
        if (obj == null) {
            return z10;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException e10) {
            zzb(str, obj, "Boolean", Boolean.valueOf(z10), e10);
            return z10;
        }
    }

    public byte getByte(String str, byte b10) {
        Object obj = this.zza.get(str);
        if (obj == null) {
            return b10;
        }
        try {
            return ((Byte) obj).byteValue();
        } catch (ClassCastException e10) {
            zzb(str, obj, "Byte", Byte.valueOf(b10), e10);
            return b10;
        }
    }

    public double getDouble(String str, double d10) {
        Object obj = this.zza.get(str);
        if (obj == null) {
            return d10;
        }
        try {
            return ((Double) obj).doubleValue();
        } catch (ClassCastException e10) {
            zzb(str, obj, "Double", Double.valueOf(d10), e10);
            return d10;
        }
    }

    public float getFloat(String str, float f10) {
        Object obj = this.zza.get(str);
        if (obj == null) {
            return f10;
        }
        try {
            return ((Float) obj).floatValue();
        } catch (ClassCastException e10) {
            zzb(str, obj, "Float", Float.valueOf(f10), e10);
            return f10;
        }
    }

    public int getInt(String str, int i10) {
        Object obj = this.zza.get(str);
        if (obj == null) {
            return i10;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException e10) {
            zzb(str, obj, "Integer", "<null>", e10);
            return i10;
        }
    }

    public long getLong(String str, long j10) {
        Object obj = this.zza.get(str);
        if (obj == null) {
            return j10;
        }
        try {
            return ((Long) obj).longValue();
        } catch (ClassCastException e10) {
            zzb(str, obj, "long", "<null>", e10);
            return j10;
        }
    }

    public String getString(String str, String str2) {
        String string = getString(str);
        return string == null ? str2 : string;
    }
}
