package io.realm;

import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* compiled from: DynamicRealmObject.java */
/* loaded from: classes4.dex */
public class p extends d1 implements io.realm.internal.o {

    /* renamed from: p  reason: collision with root package name */
    private final l0<p> f18077p;

    /* compiled from: DynamicRealmObject.java */
    /* loaded from: classes4.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f18078a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f18079b;

        static {
            int[] iArr = new int[b.values().length];
            f18079b = iArr;
            try {
                iArr[b.SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18079b[b.DICTIONARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18079b[b.LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[RealmFieldType.values().length];
            f18078a = iArr2;
            try {
                iArr2[RealmFieldType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18078a[RealmFieldType.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18078a[RealmFieldType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18078a[RealmFieldType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18078a[RealmFieldType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18078a[RealmFieldType.BINARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18078a[RealmFieldType.DATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f18078a[RealmFieldType.DECIMAL128.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f18078a[RealmFieldType.OBJECT_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f18078a[RealmFieldType.MIXED.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f18078a[RealmFieldType.UUID.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f18078a[RealmFieldType.OBJECT.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f18078a[RealmFieldType.LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f18078a[RealmFieldType.STRING_TO_INTEGER_MAP.ordinal()] = 14;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f18078a[RealmFieldType.STRING_TO_BOOLEAN_MAP.ordinal()] = 15;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f18078a[RealmFieldType.STRING_TO_STRING_MAP.ordinal()] = 16;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f18078a[RealmFieldType.STRING_TO_BINARY_MAP.ordinal()] = 17;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f18078a[RealmFieldType.STRING_TO_DATE_MAP.ordinal()] = 18;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f18078a[RealmFieldType.STRING_TO_FLOAT_MAP.ordinal()] = 19;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f18078a[RealmFieldType.STRING_TO_DOUBLE_MAP.ordinal()] = 20;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f18078a[RealmFieldType.STRING_TO_DECIMAL128_MAP.ordinal()] = 21;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f18078a[RealmFieldType.STRING_TO_OBJECT_ID_MAP.ordinal()] = 22;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f18078a[RealmFieldType.STRING_TO_UUID_MAP.ordinal()] = 23;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f18078a[RealmFieldType.STRING_TO_MIXED_MAP.ordinal()] = 24;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f18078a[RealmFieldType.STRING_TO_LINK_MAP.ordinal()] = 25;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f18078a[RealmFieldType.INTEGER_SET.ordinal()] = 26;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f18078a[RealmFieldType.BOOLEAN_SET.ordinal()] = 27;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f18078a[RealmFieldType.STRING_SET.ordinal()] = 28;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f18078a[RealmFieldType.BINARY_SET.ordinal()] = 29;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f18078a[RealmFieldType.DATE_SET.ordinal()] = 30;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f18078a[RealmFieldType.FLOAT_SET.ordinal()] = 31;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f18078a[RealmFieldType.DOUBLE_SET.ordinal()] = 32;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f18078a[RealmFieldType.DECIMAL128_SET.ordinal()] = 33;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f18078a[RealmFieldType.OBJECT_ID_SET.ordinal()] = 34;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f18078a[RealmFieldType.UUID_SET.ordinal()] = 35;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f18078a[RealmFieldType.LINK_SET.ordinal()] = 36;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f18078a[RealmFieldType.MIXED_SET.ordinal()] = 37;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f18078a[RealmFieldType.LINKING_OBJECTS.ordinal()] = 38;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f18078a[RealmFieldType.INTEGER_LIST.ordinal()] = 39;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f18078a[RealmFieldType.BOOLEAN_LIST.ordinal()] = 40;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f18078a[RealmFieldType.STRING_LIST.ordinal()] = 41;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f18078a[RealmFieldType.BINARY_LIST.ordinal()] = 42;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f18078a[RealmFieldType.DATE_LIST.ordinal()] = 43;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f18078a[RealmFieldType.FLOAT_LIST.ordinal()] = 44;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f18078a[RealmFieldType.DOUBLE_LIST.ordinal()] = 45;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f18078a[RealmFieldType.DECIMAL128_LIST.ordinal()] = 46;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f18078a[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 47;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f18078a[RealmFieldType.UUID_LIST.ordinal()] = 48;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f18078a[RealmFieldType.MIXED_LIST.ordinal()] = 49;
            } catch (NoSuchFieldError unused52) {
            }
        }
    }

    /* compiled from: DynamicRealmObject.java */
    /* loaded from: classes4.dex */
    private enum b {
        LIST,
        DICTIONARY,
        SET
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(io.realm.a aVar, io.realm.internal.q qVar) {
        l0<p> l0Var = new l0<>(this);
        this.f18077p = l0Var;
        l0Var.r(aVar);
        l0Var.s(qVar);
        l0Var.p();
    }

    private p0 d(long j10) {
        return new p0(s0.b(this.f18077p.f(), this.f18077p.g().getNativeRealmAny(j10)));
    }

    @Override // io.realm.internal.o
    public l0 b() {
        return this.f18077p;
    }

    public String[] c() {
        this.f18077p.f().e();
        return this.f18077p.g().getColumnNames();
    }

    public boolean equals(Object obj) {
        this.f18077p.f().e();
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        String path = this.f18077p.f().getPath();
        String path2 = pVar.f18077p.f().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String p10 = this.f18077p.g().getTable().p();
        String p11 = pVar.f18077p.g().getTable().p();
        if (p10 == null ? p11 != null : !p10.equals(p11)) {
            return false;
        }
        if (this.f18077p.g().getObjectKey() == pVar.f18077p.g().getObjectKey()) {
            return true;
        }
        return false;
    }

    public String getType() {
        this.f18077p.f().e();
        return this.f18077p.g().getTable().h();
    }

    public int hashCode() {
        int i10;
        this.f18077p.f().e();
        String path = this.f18077p.f().getPath();
        String p10 = this.f18077p.g().getTable().p();
        long objectKey = this.f18077p.g().getObjectKey();
        int i11 = 0;
        if (path != null) {
            i10 = path.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (527 + i10) * 31;
        if (p10 != null) {
            i11 = p10.hashCode();
        }
        return ((i12 + i11) * 31) + ((int) ((objectKey >>> 32) ^ objectKey));
    }

    public String toString() {
        this.f18077p.f().e();
        if (this.f18077p.g().isValid()) {
            StringBuilder sb2 = new StringBuilder(this.f18077p.g().getTable().h() + " = dynamic[");
            for (String str : c()) {
                long columnKey = this.f18077p.g().getColumnKey(str);
                RealmFieldType columnType = this.f18077p.g().getColumnType(columnKey);
                sb2.append("{");
                sb2.append(str);
                sb2.append(":");
                String str2 = "null";
                switch (a.f18078a[columnType.ordinal()]) {
                    case 1:
                        Boolean bool = str2;
                        if (!this.f18077p.g().isNull(columnKey)) {
                            bool = Boolean.valueOf(this.f18077p.g().getBoolean(columnKey));
                        }
                        sb2.append(bool);
                        break;
                    case 2:
                        Long l10 = str2;
                        if (!this.f18077p.g().isNull(columnKey)) {
                            l10 = Long.valueOf(this.f18077p.g().getLong(columnKey));
                        }
                        sb2.append(l10);
                        break;
                    case 3:
                        Float f10 = str2;
                        if (!this.f18077p.g().isNull(columnKey)) {
                            f10 = Float.valueOf(this.f18077p.g().getFloat(columnKey));
                        }
                        sb2.append(f10);
                        break;
                    case 4:
                        Double d10 = str2;
                        if (!this.f18077p.g().isNull(columnKey)) {
                            d10 = Double.valueOf(this.f18077p.g().getDouble(columnKey));
                        }
                        sb2.append(d10);
                        break;
                    case 5:
                        sb2.append(this.f18077p.g().getString(columnKey));
                        break;
                    case 6:
                        sb2.append(Arrays.toString(this.f18077p.g().getBinaryByteArray(columnKey)));
                        break;
                    case 7:
                        Date date = str2;
                        if (!this.f18077p.g().isNull(columnKey)) {
                            date = this.f18077p.g().getDate(columnKey);
                        }
                        sb2.append(date);
                        break;
                    case 8:
                        Decimal128 decimal128 = str2;
                        if (!this.f18077p.g().isNull(columnKey)) {
                            decimal128 = this.f18077p.g().getDecimal128(columnKey);
                        }
                        sb2.append(decimal128);
                        break;
                    case 9:
                        ObjectId objectId = str2;
                        if (!this.f18077p.g().isNull(columnKey)) {
                            objectId = this.f18077p.g().getObjectId(columnKey);
                        }
                        sb2.append(objectId);
                        break;
                    case 10:
                        String str3 = str2;
                        if (!this.f18077p.g().isNull(columnKey)) {
                            str3 = d(columnKey);
                        }
                        sb2.append(str3);
                        break;
                    case 11:
                        UUID uuid = str2;
                        if (!this.f18077p.g().isNull(columnKey)) {
                            uuid = this.f18077p.g().getUUID(columnKey);
                        }
                        sb2.append(uuid);
                        break;
                    case 12:
                        String str4 = str2;
                        if (!this.f18077p.g().isNullLink(columnKey)) {
                            str4 = this.f18077p.g().getTable().o(columnKey).h();
                        }
                        sb2.append(str4);
                        break;
                    case 13:
                        sb2.append(String.format(Locale.US, "RealmList<%s>[%s]", this.f18077p.g().getTable().o(columnKey).h(), Long.valueOf(this.f18077p.g().getModelList(columnKey).Y())));
                        break;
                    case 14:
                        sb2.append(String.format(Locale.US, "RealmDictionary<Long>[%s]", Long.valueOf(this.f18077p.g().getValueMap(columnKey, columnType).a())));
                        break;
                    case 15:
                        sb2.append(String.format(Locale.US, "RealmDictionary<Boolean>[%s]", Long.valueOf(this.f18077p.g().getValueMap(columnKey, columnType).a())));
                        break;
                    case 16:
                        sb2.append(String.format(Locale.US, "RealmDictionary<String>[%s]", Long.valueOf(this.f18077p.g().getValueMap(columnKey, columnType).a())));
                        break;
                    case 17:
                        sb2.append(String.format(Locale.US, "RealmDictionary<byte[]>[%s]", Long.valueOf(this.f18077p.g().getValueMap(columnKey, columnType).a())));
                        break;
                    case 18:
                        sb2.append(String.format(Locale.US, "RealmDictionary<Date>[%s]", Long.valueOf(this.f18077p.g().getValueMap(columnKey, columnType).a())));
                        break;
                    case 19:
                        sb2.append(String.format(Locale.US, "RealmDictionary<Float>[%s]", Long.valueOf(this.f18077p.g().getValueMap(columnKey, columnType).a())));
                        break;
                    case 20:
                        sb2.append(String.format(Locale.US, "RealmDictionary<Double>[%s]", Long.valueOf(this.f18077p.g().getValueMap(columnKey, columnType).a())));
                        break;
                    case 21:
                        sb2.append(String.format(Locale.US, "RealmDictionary<Decimal128>[%s]", Long.valueOf(this.f18077p.g().getValueMap(columnKey, columnType).a())));
                        break;
                    case 22:
                        sb2.append(String.format(Locale.US, "RealmDictionary<ObjectId>[%s]", Long.valueOf(this.f18077p.g().getValueMap(columnKey, columnType).a())));
                        break;
                    case 23:
                        sb2.append(String.format(Locale.US, "RealmDictionary<UUID>[%s]", Long.valueOf(this.f18077p.g().getValueMap(columnKey, columnType).a())));
                        break;
                    case 24:
                        sb2.append(String.format(Locale.US, "RealmDictionary<RealmAny>[%s]", Long.valueOf(this.f18077p.g().getValueMap(columnKey, columnType).a())));
                        break;
                    case 25:
                        sb2.append(String.format(Locale.US, "RealmDictionary<%s>[%s]", this.f18077p.g().getTable().o(columnKey).h(), Long.valueOf(this.f18077p.g().getModelMap(columnKey).a())));
                        break;
                    case 26:
                        sb2.append(String.format(Locale.US, "RealmSet<Long>[%s]", Long.valueOf(this.f18077p.g().getValueSet(columnKey, columnType).a())));
                        break;
                    case 27:
                        sb2.append(String.format(Locale.US, "RealmSet<Boolean>[%s]", Long.valueOf(this.f18077p.g().getValueSet(columnKey, columnType).a())));
                        break;
                    case 28:
                        sb2.append(String.format(Locale.US, "RealmSet<String>[%s]", Long.valueOf(this.f18077p.g().getValueSet(columnKey, columnType).a())));
                        break;
                    case 29:
                        sb2.append(String.format(Locale.US, "RealmSet<byte[]>[%s]", Long.valueOf(this.f18077p.g().getValueSet(columnKey, columnType).a())));
                        break;
                    case 30:
                        sb2.append(String.format(Locale.US, "RealmSet<Date>[%s]", Long.valueOf(this.f18077p.g().getValueSet(columnKey, columnType).a())));
                        break;
                    case 31:
                        sb2.append(String.format(Locale.US, "RealmSet<Float>[%s]", Long.valueOf(this.f18077p.g().getValueSet(columnKey, columnType).a())));
                        break;
                    case 32:
                        sb2.append(String.format(Locale.US, "RealmSet<Double>[%s]", Long.valueOf(this.f18077p.g().getValueSet(columnKey, columnType).a())));
                        break;
                    case 33:
                        sb2.append(String.format(Locale.US, "RealmSet<Decimal128>[%s]", Long.valueOf(this.f18077p.g().getValueSet(columnKey, columnType).a())));
                        break;
                    case 34:
                        sb2.append(String.format(Locale.US, "RealmSet<ObjectId>[%s]", Long.valueOf(this.f18077p.g().getValueSet(columnKey, columnType).a())));
                        break;
                    case 35:
                        sb2.append(String.format(Locale.US, "RealmSet<UUID>[%s]", Long.valueOf(this.f18077p.g().getValueSet(columnKey, columnType).a())));
                        break;
                    case 36:
                        sb2.append(String.format(Locale.US, "RealmSet<%s>[%s]", this.f18077p.g().getTable().o(columnKey).h(), Long.valueOf(this.f18077p.g().getModelSet(columnKey).a())));
                        break;
                    case 37:
                        sb2.append(String.format(Locale.US, "RealmSet<RealmAny>[%s]", Long.valueOf(this.f18077p.g().getValueSet(columnKey, columnType).a())));
                        break;
                    case 38:
                    default:
                        sb2.append("?");
                        break;
                    case 39:
                        sb2.append(String.format(Locale.US, "RealmList<Long>[%s]", Long.valueOf(this.f18077p.g().getValueList(columnKey, columnType).Y())));
                        break;
                    case 40:
                        sb2.append(String.format(Locale.US, "RealmList<Boolean>[%s]", Long.valueOf(this.f18077p.g().getValueList(columnKey, columnType).Y())));
                        break;
                    case 41:
                        sb2.append(String.format(Locale.US, "RealmList<String>[%s]", Long.valueOf(this.f18077p.g().getValueList(columnKey, columnType).Y())));
                        break;
                    case 42:
                        sb2.append(String.format(Locale.US, "RealmList<byte[]>[%s]", Long.valueOf(this.f18077p.g().getValueList(columnKey, columnType).Y())));
                        break;
                    case 43:
                        sb2.append(String.format(Locale.US, "RealmList<Date>[%s]", Long.valueOf(this.f18077p.g().getValueList(columnKey, columnType).Y())));
                        break;
                    case 44:
                        sb2.append(String.format(Locale.US, "RealmList<Float>[%s]", Long.valueOf(this.f18077p.g().getValueList(columnKey, columnType).Y())));
                        break;
                    case 45:
                        sb2.append(String.format(Locale.US, "RealmList<Double>[%s]", Long.valueOf(this.f18077p.g().getValueList(columnKey, columnType).Y())));
                        break;
                    case 46:
                        sb2.append(String.format(Locale.US, "RealmList<Decimal128>[%s]", Long.valueOf(this.f18077p.g().getValueList(columnKey, columnType).Y())));
                        break;
                    case 47:
                        sb2.append(String.format(Locale.US, "RealmList<ObjectId>[%s]", Long.valueOf(this.f18077p.g().getValueList(columnKey, columnType).Y())));
                        break;
                    case 48:
                        sb2.append(String.format(Locale.US, "RealmList<UUID>[%s]", Long.valueOf(this.f18077p.g().getValueList(columnKey, columnType).Y())));
                        break;
                    case 49:
                        sb2.append(String.format(Locale.US, "RealmList<RealmAny>[%s]", Long.valueOf(this.f18077p.g().getValueList(columnKey, columnType).Y())));
                        break;
                }
                sb2.append("},");
            }
            sb2.replace(sb2.length() - 1, sb2.length(), "");
            sb2.append("]");
            return sb2.toString();
        }
        return "Invalid object";
    }

    @Override // io.realm.internal.o
    public void a() {
    }
}
