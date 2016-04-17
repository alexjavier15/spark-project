/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.spark.sql.execution.datasources.parquet.test.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Nested extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Nested\",\"namespace\":\"org.apache.spark.sql.execution.datasources.parquet.test.avro\",\"fields\":[{\"name\":\"nested_ints_column\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"nested_string_column\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<java.lang.Integer> nested_ints_column;
  @Deprecated public java.lang.String nested_string_column;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Nested() {}

  /**
   * All-args constructor.
   */
  public Nested(java.util.List<java.lang.Integer> nested_ints_column, java.lang.String nested_string_column) {
    this.nested_ints_column = nested_ints_column;
    this.nested_string_column = nested_string_column;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return nested_ints_column;
    case 1: return nested_string_column;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: nested_ints_column = (java.util.List<java.lang.Integer>)value$; break;
    case 1: nested_string_column = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'nested_ints_column' field.
   */
  public java.util.List<java.lang.Integer> getNestedIntsColumn() {
    return nested_ints_column;
  }

  /**
   * Sets the value of the 'nested_ints_column' field.
   * @param value the value to set.
   */
  public void setNestedIntsColumn(java.util.List<java.lang.Integer> value) {
    this.nested_ints_column = value;
  }

  /**
   * Gets the value of the 'nested_string_column' field.
   */
  public java.lang.String getNestedStringColumn() {
    return nested_string_column;
  }

  /**
   * Sets the value of the 'nested_string_column' field.
   * @param value the value to set.
   */
  public void setNestedStringColumn(java.lang.String value) {
    this.nested_string_column = value;
  }

  /** Creates a new Nested RecordBuilder */
  public static org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested.Builder newBuilder() {
    return new org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested.Builder();
  }
  
  /** Creates a new Nested RecordBuilder by copying an existing Builder */
  public static org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested.Builder newBuilder(org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested.Builder other) {
    return new org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested.Builder(other);
  }
  
  /** Creates a new Nested RecordBuilder by copying an existing Nested instance */
  public static org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested.Builder newBuilder(org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested other) {
    return new org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested.Builder(other);
  }
  
  /**
   * RecordBuilder for Nested instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Nested>
    implements org.apache.avro.data.RecordBuilder<Nested> {

    private java.util.List<java.lang.Integer> nested_ints_column;
    private java.lang.String nested_string_column;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.nested_ints_column)) {
        this.nested_ints_column = data().deepCopy(fields()[0].schema(), other.nested_ints_column);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nested_string_column)) {
        this.nested_string_column = data().deepCopy(fields()[1].schema(), other.nested_string_column);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Nested instance */
    private Builder(org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested other) {
            super(org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested.SCHEMA$);
      if (isValidValue(fields()[0], other.nested_ints_column)) {
        this.nested_ints_column = data().deepCopy(fields()[0].schema(), other.nested_ints_column);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nested_string_column)) {
        this.nested_string_column = data().deepCopy(fields()[1].schema(), other.nested_string_column);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'nested_ints_column' field */
    public java.util.List<java.lang.Integer> getNestedIntsColumn() {
      return nested_ints_column;
    }
    
    /** Sets the value of the 'nested_ints_column' field */
    public org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested.Builder setNestedIntsColumn(java.util.List<java.lang.Integer> value) {
      validate(fields()[0], value);
      this.nested_ints_column = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'nested_ints_column' field has been set */
    public boolean hasNestedIntsColumn() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'nested_ints_column' field */
    public org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested.Builder clearNestedIntsColumn() {
      nested_ints_column = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'nested_string_column' field */
    public java.lang.String getNestedStringColumn() {
      return nested_string_column;
    }
    
    /** Sets the value of the 'nested_string_column' field */
    public org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested.Builder setNestedStringColumn(java.lang.String value) {
      validate(fields()[1], value);
      this.nested_string_column = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'nested_string_column' field has been set */
    public boolean hasNestedStringColumn() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'nested_string_column' field */
    public org.apache.spark.sql.execution.datasources.parquet.test.avro.Nested.Builder clearNestedStringColumn() {
      nested_string_column = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Nested build() {
      try {
        Nested record = new Nested();
        record.nested_ints_column = fieldSetFlags()[0] ? this.nested_ints_column : (java.util.List<java.lang.Integer>) defaultValue(fields()[0]);
        record.nested_string_column = fieldSetFlags()[1] ? this.nested_string_column : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
