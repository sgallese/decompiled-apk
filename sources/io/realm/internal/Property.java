package io.realm.internal;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.realm.RealmFieldType;
import java.util.Locale;

/* loaded from: classes4.dex */
public class Property implements h {

    /* renamed from: m  reason: collision with root package name */
    private static final long f17776m = nativeGetFinalizerPtr();

    /* renamed from: f  reason: collision with root package name */
    private long f17777f;

    /* loaded from: classes4.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f17778a;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            f17778a = iArr;
            try {
                iArr[RealmFieldType.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17778a[RealmFieldType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17778a[RealmFieldType.LINKING_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17778a[RealmFieldType.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17778a[RealmFieldType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17778a[RealmFieldType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17778a[RealmFieldType.BINARY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17778a[RealmFieldType.DATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17778a[RealmFieldType.FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f17778a[RealmFieldType.DECIMAL128.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f17778a[RealmFieldType.OBJECT_ID.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f17778a[RealmFieldType.UUID.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f17778a[RealmFieldType.MIXED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f17778a[RealmFieldType.DOUBLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f17778a[RealmFieldType.INTEGER_LIST.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f17778a[RealmFieldType.BOOLEAN_LIST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f17778a[RealmFieldType.STRING_LIST.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f17778a[RealmFieldType.BINARY_LIST.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f17778a[RealmFieldType.DATE_LIST.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f17778a[RealmFieldType.FLOAT_LIST.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f17778a[RealmFieldType.DECIMAL128_LIST.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f17778a[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f17778a[RealmFieldType.UUID_LIST.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f17778a[RealmFieldType.DOUBLE_LIST.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f17778a[RealmFieldType.MIXED_LIST.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f17778a[RealmFieldType.STRING_TO_MIXED_MAP.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f17778a[RealmFieldType.STRING_TO_BOOLEAN_MAP.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f17778a[RealmFieldType.STRING_TO_STRING_MAP.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f17778a[RealmFieldType.STRING_TO_INTEGER_MAP.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f17778a[RealmFieldType.STRING_TO_FLOAT_MAP.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f17778a[RealmFieldType.STRING_TO_DOUBLE_MAP.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f17778a[RealmFieldType.STRING_TO_BINARY_MAP.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f17778a[RealmFieldType.STRING_TO_DATE_MAP.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f17778a[RealmFieldType.STRING_TO_DECIMAL128_MAP.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f17778a[RealmFieldType.STRING_TO_OBJECT_ID_MAP.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f17778a[RealmFieldType.STRING_TO_UUID_MAP.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f17778a[RealmFieldType.STRING_TO_LINK_MAP.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f17778a[RealmFieldType.BOOLEAN_SET.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f17778a[RealmFieldType.STRING_SET.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f17778a[RealmFieldType.INTEGER_SET.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f17778a[RealmFieldType.FLOAT_SET.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f17778a[RealmFieldType.DOUBLE_SET.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f17778a[RealmFieldType.BINARY_SET.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f17778a[RealmFieldType.DATE_SET.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f17778a[RealmFieldType.DECIMAL128_SET.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f17778a[RealmFieldType.OBJECT_ID_SET.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f17778a[RealmFieldType.UUID_SET.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f17778a[RealmFieldType.LINK_SET.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f17778a[RealmFieldType.MIXED_SET.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Property(long j10) {
        this.f17777f = j10;
        g.f17814c.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(RealmFieldType realmFieldType, boolean z10) {
        int i10 = 1;
        int i11 = 0;
        switch (a.f17778a[realmFieldType.ordinal()]) {
            case 1:
                return 71;
            case 2:
                return 135;
            case 3:
                return 136;
            case 4:
                i10 = 0;
                break;
            case 5:
                break;
            case 6:
                i10 = 2;
                break;
            case 7:
                i10 = 3;
                break;
            case 8:
                i10 = 4;
                break;
            case 9:
                i10 = 5;
                break;
            case 10:
                i10 = 11;
                break;
            case 11:
                i10 = 10;
                break;
            case 12:
                i10 = 12;
                break;
            case 13:
                i10 = 9;
                break;
            case 14:
                i10 = 6;
                break;
            case 15:
                i10 = 128;
                break;
            case 16:
                i10 = 129;
                break;
            case 17:
                i10 = 130;
                break;
            case 18:
                i10 = 131;
                break;
            case 19:
                i10 = 132;
                break;
            case 20:
                i10 = 133;
                break;
            case 21:
                i10 = 139;
                break;
            case 22:
                i10 = 138;
                break;
            case 23:
                i10 = 140;
                break;
            case 24:
                i10 = 134;
                break;
            case 25:
                i10 = 137;
                break;
            case 26:
                i10 = 521;
                break;
            case 27:
                i10 = 513;
                break;
            case 28:
                i10 = 514;
                break;
            case 29:
                i10 = 512;
                break;
            case 30:
                i10 = 517;
                break;
            case 31:
                i10 = 518;
                break;
            case 32:
                i10 = 515;
                break;
            case 33:
                i10 = 516;
                break;
            case 34:
                i10 = 523;
                break;
            case 35:
                i10 = 522;
                break;
            case 36:
                i10 = 524;
                break;
            case 37:
                i10 = 519;
                break;
            case 38:
                i10 = 257;
                break;
            case 39:
                i10 = 258;
                break;
            case 40:
                i10 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
                break;
            case 41:
                i10 = 261;
                break;
            case 42:
                i10 = 262;
                break;
            case 43:
                i10 = 259;
                break;
            case 44:
                i10 = 260;
                break;
            case 45:
                i10 = 267;
                break;
            case 46:
                i10 = 266;
                break;
            case 47:
                i10 = 268;
                break;
            case 48:
                return 263;
            case 49:
                i10 = 265;
                break;
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported filed type: '%s'.", realmFieldType.name()));
        }
        if (!z10) {
            i11 = 64;
        }
        return i10 | i11;
    }

    private static RealmFieldType b(int i10) {
        int i11 = i10 & (-65);
        switch (i11) {
            case 0:
                return RealmFieldType.INTEGER;
            case 1:
                return RealmFieldType.BOOLEAN;
            case 2:
                return RealmFieldType.STRING;
            case 3:
                return RealmFieldType.BINARY;
            case 4:
                return RealmFieldType.DATE;
            case 5:
                return RealmFieldType.FLOAT;
            case 6:
                return RealmFieldType.DOUBLE;
            case 7:
                return RealmFieldType.OBJECT;
            default:
                switch (i11) {
                    case 9:
                        return RealmFieldType.MIXED;
                    case 10:
                        return RealmFieldType.OBJECT_ID;
                    case 11:
                        return RealmFieldType.DECIMAL128;
                    case 12:
                        return RealmFieldType.UUID;
                    default:
                        switch (i11) {
                            case 128:
                                return RealmFieldType.INTEGER_LIST;
                            case 129:
                                return RealmFieldType.BOOLEAN_LIST;
                            case 130:
                                return RealmFieldType.STRING_LIST;
                            case 131:
                                return RealmFieldType.BINARY_LIST;
                            case 132:
                                return RealmFieldType.DATE_LIST;
                            case 133:
                                return RealmFieldType.FLOAT_LIST;
                            case 134:
                                return RealmFieldType.DOUBLE_LIST;
                            case 135:
                                return RealmFieldType.LIST;
                            case 136:
                                return RealmFieldType.LINKING_OBJECTS;
                            case 137:
                                return RealmFieldType.MIXED_LIST;
                            case 138:
                                return RealmFieldType.OBJECT_ID_LIST;
                            case 139:
                                return RealmFieldType.DECIMAL128_LIST;
                            case 140:
                                return RealmFieldType.UUID_LIST;
                            default:
                                switch (i11) {
                                    case UserVerificationMethods.USER_VERIFY_HANDPRINT /* 256 */:
                                        return RealmFieldType.INTEGER_SET;
                                    case 257:
                                        return RealmFieldType.BOOLEAN_SET;
                                    case 258:
                                        return RealmFieldType.STRING_SET;
                                    case 259:
                                        return RealmFieldType.BINARY_SET;
                                    case 260:
                                        return RealmFieldType.DATE_SET;
                                    case 261:
                                        return RealmFieldType.FLOAT_SET;
                                    case 262:
                                        return RealmFieldType.DOUBLE_SET;
                                    case 263:
                                        return RealmFieldType.LINK_SET;
                                    default:
                                        switch (i11) {
                                            case 265:
                                                return RealmFieldType.MIXED_SET;
                                            case 266:
                                                return RealmFieldType.OBJECT_ID_SET;
                                            case 267:
                                                return RealmFieldType.DECIMAL128_SET;
                                            case 268:
                                                return RealmFieldType.UUID_SET;
                                            default:
                                                switch (i11) {
                                                    case 512:
                                                        return RealmFieldType.STRING_TO_INTEGER_MAP;
                                                    case 513:
                                                        return RealmFieldType.STRING_TO_BOOLEAN_MAP;
                                                    case 514:
                                                        return RealmFieldType.STRING_TO_STRING_MAP;
                                                    case 515:
                                                        return RealmFieldType.STRING_TO_BINARY_MAP;
                                                    case 516:
                                                        return RealmFieldType.STRING_TO_DATE_MAP;
                                                    case 517:
                                                        return RealmFieldType.STRING_TO_FLOAT_MAP;
                                                    case 518:
                                                        return RealmFieldType.STRING_TO_DOUBLE_MAP;
                                                    case 519:
                                                        return RealmFieldType.STRING_TO_LINK_MAP;
                                                    default:
                                                        switch (i11) {
                                                            case 521:
                                                                return RealmFieldType.STRING_TO_MIXED_MAP;
                                                            case 522:
                                                                return RealmFieldType.STRING_TO_OBJECT_ID_MAP;
                                                            case 523:
                                                                return RealmFieldType.STRING_TO_DECIMAL128_MAP;
                                                            case 524:
                                                                return RealmFieldType.STRING_TO_UUID_MAP;
                                                            default:
                                                                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported property type: '%d'", Integer.valueOf(i10)));
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    static native long nativeCreateComputedLinkProperty(String str, String str2, String str3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long nativeCreatePersistedLinkProperty(String str, String str2, int i10, String str3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long nativeCreatePersistedProperty(String str, String str2, int i10, boolean z10, boolean z11);

    private static native long nativeGetColumnKey(long j10);

    private static native long nativeGetFinalizerPtr();

    private static native String nativeGetLinkedObjectName(long j10);

    private static native int nativeGetType(long j10);

    public long c() {
        return nativeGetColumnKey(this.f17777f);
    }

    public String d() {
        return nativeGetLinkedObjectName(this.f17777f);
    }

    public RealmFieldType e() {
        return b(nativeGetType(this.f17777f));
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f17776m;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f17777f;
    }
}
