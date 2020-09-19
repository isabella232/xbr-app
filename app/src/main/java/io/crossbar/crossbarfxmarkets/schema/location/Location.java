// automatically generated by the FlatBuffers compiler, do not modify

package io.crossbar.crossbarfxmarkets.schema.location;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
/**
 * A single location sample (mostly for on_tile_enter/on_tile_leave).
 */
public final class Location extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_1_12_0(); }
  public static Location getRootAsLocation(ByteBuffer _bb) { return getRootAsLocation(_bb, new Location()); }
  public static Location getRootAsLocation(ByteBuffer _bb, Location obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Location __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  /**
   * Persistent (static) ID of the entity tracking its location.
   */
  public int entity(int j) { int o = __offset(4); return o != 0 ? bb.get(__vector(o) + j * 1) & 0xFF : 0; }
  public int entityLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public ByteVector entityVector() { return entityVector(new ByteVector()); }
  public ByteVector entityVector(ByteVector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer entityAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer entityInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  /**
   * Sample: point in time (UTC) when sample was measured, in Unix time (ns precision).
   */
  public long timestamp() { int o = __offset(6); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  /**
   * Sample: WGS84 longitude, rounded to 7 decimals.
   */
  public double lon() { int o = __offset(8); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }
  /**
   * Sample: WGS84 latitude, rounded to 7 decimals.
   */
  public double lat() { int o = __offset(10); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }

  public static int createLocation(FlatBufferBuilder builder,
      int entityOffset,
      long timestamp,
      double lon,
      double lat) {
    builder.startTable(4);
    Location.addLat(builder, lat);
    Location.addLon(builder, lon);
    Location.addTimestamp(builder, timestamp);
    Location.addEntity(builder, entityOffset);
    return Location.endLocation(builder);
  }

  public static void startLocation(FlatBufferBuilder builder) { builder.startTable(4); }
  public static void addEntity(FlatBufferBuilder builder, int entityOffset) { builder.addOffset(0, entityOffset, 0); }
  public static int createEntityVector(FlatBufferBuilder builder, byte[] data) { return builder.createByteVector(data); }
  public static int createEntityVector(FlatBufferBuilder builder, ByteBuffer data) { return builder.createByteVector(data); }
  public static void startEntityVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static void addTimestamp(FlatBufferBuilder builder, long timestamp) { builder.addLong(1, timestamp, 0L); }
  public static void addLon(FlatBufferBuilder builder, double lon) { builder.addDouble(2, lon, 0.0); }
  public static void addLat(FlatBufferBuilder builder, double lat) { builder.addDouble(3, lat, 0.0); }
  public static int endLocation(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Location get(int j) { return get(new Location(), j); }
    public Location get(Location obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

