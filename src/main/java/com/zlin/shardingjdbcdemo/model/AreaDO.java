package com.zlin.shardingjdbcdemo.model;

public class AreaDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_area.id
     *
     * @mbg.generated Sat Aug 28 21:45:16 CST 2021
     */
    private Integer id;

    @Override
    public String toString() {
        return "AreaDO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_area.name
     *
     * @mbg.generated Sat Aug 28 21:45:16 CST 2021
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_area.id
     *
     * @return the value of t_area.id
     *
     * @mbg.generated Sat Aug 28 21:45:16 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_area.id
     *
     * @param id the value for t_area.id
     *
     * @mbg.generated Sat Aug 28 21:45:16 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_area.name
     *
     * @return the value of t_area.name
     *
     * @mbg.generated Sat Aug 28 21:45:16 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_area.name
     *
     * @param name the value for t_area.name
     *
     * @mbg.generated Sat Aug 28 21:45:16 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}